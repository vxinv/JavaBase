package proxy.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

@ChannelHandler.Sharable
public class WriteHandler extends ChannelOutboundHandlerAdapter {

    public static WriteHandler INSTANCE = new WriteHandler();

    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {

        super.write(ctx, msg, promise);
    }
}
