package proxy.handler;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.MessageToMessageCodec;
import lombok.extern.slf4j.Slf4j;
import proxy.constant.Protocal;

import java.util.List;

/**
 * 中转站
 */
@ChannelHandler.Sharable
@Slf4j
public class SingleProxyHandler  extends MessageToMessageCodec<ByteBuf,ByteBuf> {


    public static final SingleProxyHandler INSTANCE = new SingleProxyHandler();

    ChannelHandlerContext clientContext;
    ChannelHandlerContext tmpContext;


    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        super.handlerRemoved(ctx);
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {


        if (clientContext == null && ctx.channel().attr(Protocal.client).get().equals("client")){
            clientContext = ctx;
        }

        if (clientContext == null){
            log.error("当前没有监听的客户端");
            // 回复为空
            out.add(new Object());
        }

        if (ctx.channel().attr(Protocal.client).get() == null){
            tmpContext =ctx;
        }

        out.add(msg);
        if (ctx == tmpContext){
            clientContext.writeAndFlush(Unpooled.copiedBuffer(msg));
        }
        tmpContext.writeAndFlush(Unpooled.copiedBuffer(msg));
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf msg, List<Object> out) throws Exception {
        out.add(msg);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

        if (!ctx.channel().isActive()){
            ctx.channel().close();
        }

    }
}
