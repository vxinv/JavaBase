package proxy.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.AttributeKey;
import io.netty.util.ReferenceCountUtil;
import lombok.extern.slf4j.Slf4j;
import proxy.constant.Protocal;

@Slf4j
@ChannelHandler.Sharable
public class RegisterHandler extends SimpleChannelInboundHandler<ByteBuf> {

    public static final RegisterHandler INSTANCE = new RegisterHandler();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
        // check
        msg.markReaderIndex();
        int checkNumber = msg.readInt();
        if (checkNumber == Protocal.MAGIC_NUMBER){
            msg.resetReaderIndex();
            // 取消对该channel的判断
            ctx.pipeline().remove(this);
            ctx.channel().attr(Protocal.client).set("client");
        }

        msg.resetReaderIndex();
        ReferenceCountUtil.retain(msg);
        ctx.writeAndFlush(msg);
    }
}
