package proxy.trafficProxy;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxy.handler.PacketCodecHandler;
import proxy.handler.ProxyHandler;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4j
public class TrafficServer {

    @Autowired
    TrafficConfig trafficConfig;

    private Channel serverChannel;
    private NioEventLoopGroup bossGroup;
    private NioEventLoopGroup workerGroup;

    @PostConstruct
    public void init(){

        log.info("server 初始化开始");

        bossGroup = new NioEventLoopGroup(1);
        workerGroup = new NioEventLoopGroup();

        final ServerBootstrap serverBootstrap = new ServerBootstrap();
        serverBootstrap
                .group(bossGroup, workerGroup)

                .channel(NioServerSocketChannel.class)

                .option(ChannelOption.SO_BACKLOG, 1024)

                .childOption(ChannelOption.SO_KEEPALIVE, true)

                .childOption(ChannelOption.TCP_NODELAY, true)

                .childHandler(new ChannelInitializer<NioSocketChannel>() {

                    protected void initChannel(NioSocketChannel ch) {
                       // ch.pipeline().addLast(new SpliterHandler());
                        ch.pipeline().addLast( PacketCodecHandler.INSTANCE);
                        ch.pipeline().addLast(new ProxyHandler());
                    }
                });

        try {
          serverChannel =  serverBootstrap.bind(trafficConfig.getLocalPort()).sync().channel();
          log.info("绑定端口:{}成功",trafficConfig.getLocalPort());
        } catch (InterruptedException e) {
            log.error("监听本地端口失败",e);
        }
    }

    @PreDestroy
    public void shutdown() throws InterruptedException {
        log.info("Stopping proxy transport!");
        try {
            serverChannel.close().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
        log.info("proxy transport stopped!");
    }

}
