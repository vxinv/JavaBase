package client.Handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;

@Slf4j
@ChannelHandler.Sharable
public class ProxyHandler extends SimpleChannelInboundHandler<ByteBuf> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        while (msg.isReadable()){

            msg.readBytes(byteArrayOutputStream,msg.readableBytes());
        }

        String result = byteArrayOutputStream.toString();

        System.out.println(result);

        //ctx.writeAndFlush(Unpooled.copiedBuffer(result.getBytes()));

    }



    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("channel Active:{}",ctx.channel() );
        super.channelActive(ctx);
    }
}
