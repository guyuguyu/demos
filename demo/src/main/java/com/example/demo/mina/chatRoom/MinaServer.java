package com.example.demo.mina.chatRoom;

import java.io.IOException;
import java.net.InetSocketAddress;
import org.apache.mina.core.filterchain.DefaultIoFilterChainBuilder;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.transport.socket.SocketAcceptor;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

/**
 * <b>function:</b> 服务器启动类
 * @author hoojo
 * @createDate 2012-6-29 下午07:11:00
 * @file MinaServer.java
 * @package com.hoo.mina.server
 * @project ApacheMiNa
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 * 上面的代码主要完成启动参数的设置，如端口、session参数；消息核心业务处理器，
 * 这个比较关键，我们所有的业务都要在这里完成；
 * 然后就是日志、编码过滤器，我们可以对发送或接收到的消息进行处理、编码操作，
 * 在网络中传递数据都是字节流传递的，我们要获取消息必须把二进制的字节流转换的字符串来处理，所以这个也是必须的；
 * 同时你还可以对服务器添加日志过滤器，来显示日志。

这样服务器端程序就已经完成，你可以用socket或mina client等方式连接服务器，进行通信。

启动服务器，在浏览器中输入http://localhost:9999 这里的服务器绑定的端口是9999
 */
public class MinaServer {
    private SocketAcceptor acceptor;

    public MinaServer() {
        // 创建非阻塞的server端的Socket连接
        acceptor = new NioSocketAcceptor();
    }

    public boolean start() {
        DefaultIoFilterChainBuilder filterChain = acceptor.getFilterChain();
        // 添加编码过滤器 处理乱码、编码问题
        filterChain.addLast("codec", new ProtocolCodecFilter(new CharsetCodecFactory()));

        /*LoggingFilter loggingFilter = new LoggingFilter();
        loggingFilter.setMessageReceivedLogLevel(LogLevel.INFO);
        loggingFilter.setMessageSentLogLevel(LogLevel.INFO);
        // 添加日志过滤器
        filterChain.addLast("loger", loggingFilter);*/

        // 设置核心消息业务处理器
        acceptor.setHandler(new ServerMessageHandler());
        // 设置session配置，30秒内无操作进入空闲状态
        acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE, 30);

        try {
            // 绑定端口9999
            acceptor.bind(new InetSocketAddress(9999));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MinaServer server = new MinaServer();
        server.start();
    }
}
