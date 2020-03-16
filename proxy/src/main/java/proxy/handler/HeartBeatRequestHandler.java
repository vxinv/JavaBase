package proxy.handler;



import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import proxy.protocal.HeartBeatPacket;


@ChannelHandler.Sharable
@Slf4j

public class HeartBeatRequestHandler extends SimpleChannelInboundHandler<HeartBeatPacket> {

    public static final HeartBeatRequestHandler INSTANCE = new HeartBeatRequestHandler();

    private HeartBeatRequestHandler() {

    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, HeartBeatPacket requestPacket) {
        log.info("服务端接受到心跳数据:{}", requestPacket);
        ctx.writeAndFlush(new HeartBeatPacket());
    }
}
