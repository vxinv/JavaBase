package proxy.trafficProxy;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import proxy.handler.*;

import java.util.Date;

/**
 * 对监听的数据进行转发
 */
public class SingleServer {

    NioEventLoopGroup group = new NioEventLoopGroup(1);
    ServerBootstrap bootstrap = new ServerBootstrap();
    int port = 7788;
    public static void main(String[] args) {
        new SingleServer().proxy();
    }

    /**
     * 转发
     */
    public void proxy(){
        bootstrap.group(group).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(NewRgisterHandler.INSTANCE);
                        ch.pipeline().addLast(NewSingleProxyHandler.INSTANCE);
                        ch.pipeline().addLast(WriteHandler.INSTANCE);
                    }
                });
        bootstrap.bind(port).addListener(future -> {
                if (future.isSuccess()){
                        System.out.println(new Date() + ": 端口[" + port + "]绑定成功!");
                } else {
                    System.err.println("端口[" + port + "]绑定失败!");
                }
        });
    }
}
