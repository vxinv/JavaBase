package proxy.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import proxy.constant.Protocal;

@ChannelHandler.Sharable
public class NewSingleProxyHandler extends ChannelInboundHandlerAdapter {

    public static NewSingleProxyHandler INSTANCE = new NewSingleProxyHandler();

    private ChannelHandlerContext clientContext;

    private ChannelHandlerContext tmpContext;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        if (clientContext == null && ctx.channel().attr(Protocal.client).get() != null){
            clientContext = ctx;
        }

        if ( ctx.channel().attr(Protocal.client).get() == null){
            tmpContext = ctx;
        }

        if (ctx == clientContext && tmpContext != null){
            tmpContext.writeAndFlush(msg);
            return;
        }

        clientContext.writeAndFlush(msg);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if (!ctx.channel().isActive()){
            ctx.channel().close();
        }
        System.out.println("链接退出");
    }
}
