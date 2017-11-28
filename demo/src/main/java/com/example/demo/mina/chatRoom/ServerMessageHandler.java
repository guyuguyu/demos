package com.example.demo.mina.chatRoom;

import java.net.InetSocketAddress;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import org.apache.mina.core.future.CloseFuture;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <b>function:</b> 处理服务器端消息
 * @author hoojo
 * @createDate 2012-6-26 下午01:12:34
 * @file ServerMessageHandler.java
 * @package com.hoo.mina.server.message
 * @project ApacheMiNa
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 * 编写IoHandler实现类代码，IoHander这里是Io读写的事件驱动类，
 * 这里的Io操作都会触发里面的事件。
 * 你所有的业务逻辑都应当在这个类中完成。
 * sessionCreated：当一个新的连接建立时，由I/O processor thread调用；

sessionOpened：当连接打开是调用；

messageReceived： 当接收了一个消息时调用；

messageSent：当一个消息被(IoSession#write)发送出去后调用；

sessionIdle：当连接进入空闲状态时调用；

sessionClosed：当连接关闭时调用；

exceptionCaught：实现IoHandler的类抛出异常时调用；

一般情况下，我们最关心的只有messageReceived方法，接收消息并处理，
然后调用IoSession的write方法发送出消息！
（注意：这里接收到的消息都是Java对象，在IoFilter中所有二进制数据都被解码）
一般情况下很少有人实现IoHandler接口，而是继承它的一个实现类IoHandlerAdapter，
这样不用覆盖它的7个方法，只需要根据具体需求覆盖其中的几个方法就可以！

Iohandler的7个方法其实是根据session的4个状态值间变化来调用的：

 Connected：会话被创建并使用；

 Idle：会话在一段时间(可配置)内没有任何请求到达，进入空闲状态；

 Closing：会话将被关闭（剩余message将被强制flush）；

 Closed：会话被关闭；
 */

public class ServerMessageHandler implements IoHandler{
    private final static Logger log = LoggerFactory.getLogger(ServerMessageHandler.class);

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        log.info("服务器发生异常： {}", cause.getMessage());
    }

    @Override
    public void messageReceived(IoSession session, Object message) throws Exception {
        log.info("服务器接收到数据： {}", message);
        String content = message.toString();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String datetime = sdf.format(new Date());

        log.info("转发 messageReceived: " + datetime + "\t" + content);
        // 拿到所有的客户端Session
        Collection<IoSession> sessions = session.getService().getManagedSessions().values();
        // 向所有客户端发送数据
        for (IoSession sess : sessions) {
            sess.write(datetime + "\t" + content,new InetSocketAddress(9999));
            System.out.println(sess.getId());
        }
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        log.info("服务器发送消息： {}", message);
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        log.info("关闭当前session：{}#{}", session.getId(), session.getRemoteAddress());

        CloseFuture closeFuture = session.close(true);
        closeFuture.addListener(new IoFutureListener<IoFuture>() {
            public void operationComplete(IoFuture future) {
                if (future instanceof CloseFuture) {
                    ((CloseFuture) future).setClosed();
                    log.info("sessionClosed CloseFuture setClosed-->{},", future.getSession().getId());
                }
            }
        });
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        log.info("创建一个新连接：{}", session.getRemoteAddress());
        session.write("欢迎来到聊天室!");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status) throws Exception {
        log.info("当前连接{}处于空闲状态：{}", session.getRemoteAddress(), status);
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        log.info("打开一个session：{}#{}", session.getId(), session.getBothIdleCount());
    }
}
