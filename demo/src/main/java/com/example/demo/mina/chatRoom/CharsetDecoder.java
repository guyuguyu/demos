package com.example.demo.mina.chatRoom;

import java.nio.charset.Charset;
import org.apache.log4j.Logger;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;


/**
 * <b>function:</b> 字符解码
 * @author hoojo
 * @createDate 2012-6-26 上午11:14:18
 * @file CharsetDecoder.java
 * @package com.hoo.mina.code
 * @project ApacheMiNa
 * @blog http://blog.csdn.net/IBM_hoojo
 * @email hoojo_@126.com
 * @version 1.0
 *
 * 上面的decode方法是解码方法，它主要是把读取到数据中的换行符去掉。因为在mina通信协议中以换行符为结束符，
    如果不定义结束符那么程序会在那里一直等待下一条发送的数据。

这里用到了IoBuffer，MiNa中传输的所有二进制信息都存放在IoBuffer中，
IoBuffer是对Java NIO中ByteBuffer的封装（Mina2.0以前版本这个接口也是ByteBuffer），
提供了更多操作二进制数据，对象的方法，并且存储空间可以自增长，用起来非常方便；
简单理解，它就是个可变长度的byte字节数组！

1. static IoBuffer allocate(int capacity,boolean useDirectBuffer)

创建IoBuffer实例，第一个参数指定初始化容量，第二个参数指定使用直接缓冲区还是JAVA 内存堆的缓存区，默认为false。

2．IoBuffer setAutoExpand(boolean autoExpand)

这个方法设置IoBuffer 为自动扩展容量，也就是前面所说的长度可变，那么可以看出长度可变这个特性默认是不开启的。

3. IoBuffer flip()

limit=position, position=0,重置mask，为了读取做好准备，一般是结束buffer操作，将buffer写入输出流时调用；
这个必须要调用，否则极有可能position!=limit，导致position后面没有数据；每次写入数据到输出流时，必须确保position=limit。

4. IoBuffer clear()与IoBuffer reset()

clear：limit=capacity , position=0,重置mark；它是不清空数据，但从头开始存放数据做准备---相当于覆盖老数据。

reset就是清空数据

5. int remaining()与boolean hasRemaining()

这两个方法一般是在调用了flip方法后使用的，remaining()是返回limt-position的值！
hasRemaining()则是判断当前是否有数据，返回position < limit的boolean值！
 */
public class CharsetDecoder implements ProtocolDecoder{
    private final static Logger log = Logger.getLogger(CharsetDecoder.class);

    private final static Charset charset = Charset.forName("UTF-8");
    // 可变的IoBuffer数据缓冲区
    private IoBuffer buff = IoBuffer.allocate(100).setAutoExpand(true);

    @Override
    public void decode(IoSession session, IoBuffer in, ProtocolDecoderOutput out) throws Exception {
        log.info("#########decode#########");

        // 如果有消息
        while (in.hasRemaining()) {
            // 判断消息是否是结束符，不同平台的结束符也不一样；
            // windows换行符（\r\n）就认为是一个完整消息的结束符了； UNIX 是\n；MAC 是\r
            byte b = in.get();
            if (b == '\n') {
                buff.flip();
                byte[] bytes = new byte[buff.limit()];
                buff.get(bytes);
                String message = new String(bytes, charset);

                buff = IoBuffer.allocate(100).setAutoExpand(true);

                // 如果结束了，就写入转码后的数据
                out.write(message);
                //log.info("message: " + message);
            } else {
                buff.put(b);
            }
        }
    }

    @Override
    public void dispose(IoSession session) throws Exception {
        log.info("#########dispose#########");
        log.info(session.getCurrentWriteMessage());
    }

    @Override
    public void finishDecode(IoSession session, ProtocolDecoderOutput out) throws Exception {
        log.info("#########完成解码#########");
    }
}
