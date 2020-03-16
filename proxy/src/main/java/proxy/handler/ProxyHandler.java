package proxy.handler;


import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class ProxyHandler extends SimpleChannelInboundHandler<String> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        log.info("监听本地端口：{}",ctx.channel().localAddress().getClass().getName());
        log.info("连接远程端口：{}",ctx.channel().remoteAddress());
        System.out.println("接受的数据"+msg);
        // 转发给监听的客户端  接受监听客户端的返回数据
        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        log.info("channel Active:{}",ctx.channel() );
        super.channelActive(ctx);
    }
}
