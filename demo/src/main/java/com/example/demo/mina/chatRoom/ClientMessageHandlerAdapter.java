package com.example.demo.mina.chatRoom;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <b>function:</b> 客户端消息处理类
 * @author hoojo
 * @createDate 2012-6-29 下午07:24:22
 * @file ClientMessageHandlerAdapter.java
 * @package com.hoo.mina.client.message
 * @project ApacheMiNa
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 * 这里我们没有实现IoHandler这个接口，而是继承了IoHandlerAdapter这类，
 * 覆盖了messageReceived、messageSent这两个方法。
 * IoHandlerAdapter是IoHandler接口的一个实现，我们这里没有必要实现IoHandler的所有方法。
 */
public class ClientMessageHandlerAdapter extends IoHandlerAdapter{
    private final static Logger log = LoggerFactory.getLogger(ClientMessageHandlerAdapter.class);

    public void messageReceived(IoSession session, Object message) throws Exception {
        String content = message.toString();
        log.info("客户端收到消息 : " + content);
    }

    public void messageSent(IoSession session , Object message) throws Exception{
        log.info("messageSent 客户端发送消息：" + message);
    }

    @Override
    public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
        log.info("服务器发生异常： {}", cause.getMessage());
    }
}
