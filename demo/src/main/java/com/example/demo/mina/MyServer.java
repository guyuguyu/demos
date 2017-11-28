package com.example.demo.mina;


import org.apache.mina.core.service.IoAcceptor;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class MyServer {

    private static final Logger logger= LoggerFactory.getLogger(MyServer.class);

    public static void main(String[] args) {
        IoAcceptor acceptor=new NioSocketAcceptor();

        acceptor.getFilterChain().addLast("logger",new LoggingFilter());
        acceptor.getFilterChain().addLast("codec",new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        acceptor.getSessionConfig().setReadBufferSize(1024);
        acceptor.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,10);
        acceptor.setHandler(new MyHandler());

        try {
            acceptor.bind(new InetSocketAddress(8888));
            System.out.println("服务端启动");
        } catch (IOException e) {
            e.printStackTrace();
//            logger.error(e.getMessage(),e);
        }

    }

    static class MyHandler extends IoHandlerAdapter{
        @Override
        public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
            System.out.println("服务端exceptionCaught");
//            logger.error(cause.getMessage(), cause);
            session.close(true);
        }

        @Override
        public void messageReceived(IoSession session, Object message) throws Exception {
            System.out.println("服务端messageReceived"+message);
//            logger.info("Received message " + message);
            session.write("服务端自动回复：已收到");
        }

        @Override
        public void messageSent(IoSession session, Object message) throws Exception {
            System.out.println("服务端messageSent"+message);
//            logger.info("Sent message " + message);
        }
    }

}
