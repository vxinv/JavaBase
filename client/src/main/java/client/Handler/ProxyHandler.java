package client.Handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.io.IOException;


@Slf4j
@ChannelHandler.Sharable
public class ProxyHandler extends SimpleChannelInboundHandler<ByteBuf> {

    // serverChannel
    ChannelHandlerContext serverContext;
    // 临时
    ChannelHandlerContext tmpContext;

    // 接受服务端发来的数据
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {

        if (serverContext == null){
            serverContext = ctx;
            Channel connect = NetSocket.connect("127.0.0.1", 7000);
            connect.writeAndFlush(msg);
            return;
        }
        if (ctx != serverContext){
            tmpContext = ctx;
            // 转发本地服务发送的数据
            serverContext.writeAndFlush(msg);
            return;
        }
        // 转发从服务端接受的数据
        if (tmpContext!=null){
            serverContext.writeAndFlush(msg);
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("channel Active:{}",ctx.channel() );
        super.channelActive(ctx);
    }

    public void printMsg(ByteBuf msg) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (msg.isReadable()){
            msg.readBytes(byteArrayOutputStream,msg.readableBytes());
        }
        String result = byteArrayOutputStream.toString();
        System.out.println(result);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if(!ctx.channel().isActive()){
            ctx.channel().close();
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("向服务端注册");
        ctx.writeAndFlush(Unpooled.copiedBuffer("11111".getBytes()));
    }
}
