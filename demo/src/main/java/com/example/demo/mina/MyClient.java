package com.example.demo.mina;

import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.service.IoConnector;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFilter;
import org.apache.mina.filter.codec.textline.TextLineCodecFactory;
import org.apache.mina.filter.logging.LoggingFilter;
import org.apache.mina.transport.socket.nio.NioSocketConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.nio.charset.Charset;

public class MyClient {

    private static final Logger logger= LoggerFactory.getLogger(MyClient.class);

    public static void main(String[] args) {
        IoConnector connector=new NioSocketConnector();
        connector.setConnectTimeoutMillis(10*1000);
        connector.getFilterChain().addLast("logger",new LoggingFilter());
        connector.getFilterChain().addLast("codec",new ProtocolCodecFilter(new TextLineCodecFactory(Charset.forName("UTF-8"))));
        connector.getSessionConfig().setReadBufferSize(1024);
        connector.getSessionConfig().setIdleTime(IdleStatus.BOTH_IDLE,10);
        connector.setHandler(new MyClientHandler());
        IoSession session=null;
        try {
            ConnectFuture future=connector.connect(new InetSocketAddress("localhost",8888));
            future.awaitUninterruptibly();
            session=future.getSession();
            session.write("我是一个客户端");
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
        session.getCloseFuture().awaitUninterruptibly();
        connector.dispose();

    }

    static class MyClientHandler extends IoHandlerAdapter{
        @Override
        public void exceptionCaught(IoSession session, Throwable cause) throws Exception {
            System.out.println("客户端exceptionCaught");
//            logger.error(cause.getMessage(), cause);
            session.close(true);
        }

        @Override
        public void messageReceived(IoSession session, Object message) throws Exception {
            System.out.println("客户端messageReceived"+message);
//            logger.info("Received message " + message);
        }

        @Override
        public void messageSent(IoSession session, Object message) throws Exception {
            System.out.println("客户端messageSent"+message);
//            logger.info("Sent message " + message);
        }
    }

}
