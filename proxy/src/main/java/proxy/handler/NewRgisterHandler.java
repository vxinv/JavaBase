package proxy.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import lombok.extern.slf4j.Slf4j;
import proxy.constant.Protocal;

@ChannelHandler.Sharable

public class NewRgisterHandler extends ChannelInboundHandlerAdapter {

    public static  NewRgisterHandler INSTANCE = new NewRgisterHandler();

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        ByteBuf buf = (ByteBuf) msg;
        buf.markReaderIndex();
        int checkNumber = buf.readByte();
        buf.resetReaderIndex();
        if (checkNumber == Protocal.MAGIC_NUMBER){
            ctx.pipeline().remove(this);
            ctx.channel().attr(Protocal.client).set("client");
        }
        super.channelRead(ctx, msg);
    }
}
