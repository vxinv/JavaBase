package client.Handler;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * 发送Http请求
 */
public class NetSocket {

    static  NioEventLoopGroup workerGroup;

    static  Bootstrap bootstrap;

    static {
        workerGroup = new NioEventLoopGroup();
        bootstrap = new Bootstrap();
        bootstrap
                .group(workerGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 5000)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    public void initChannel(SocketChannel ch) {
                        ch.pipeline().addLast(new ProxyHandler());
                    }
                });
    }
    /**
     * 链接
     */
    public static Channel connect(String host,int port){

        try {
            Channel channel = bootstrap.connect(host, port).sync().channel();
            return channel;
        } catch (InterruptedException e) {
            System.out.println("connect failed");
            return null;
        }
    }

}
