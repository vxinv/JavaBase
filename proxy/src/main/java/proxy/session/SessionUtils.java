package proxy.session;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.springframework.stereotype.Component;
import proxy.protocal.rsp.ResRegiterPacket;

import java.util.HashMap;
import java.util.LinkedHashSet;

// 会话管理

@Component
public class SessionUtils {

   public  LinkedHashSet<Channel> channels = new LinkedHashSet<>();

    // 本地链接的channel 的监听端口 和 链接的socket
    HashMap<Integer,Channel> listenPortapPort = new HashMap<Integer, Channel>();

    // 当前一一对应的 端口映射
    HashMap<Integer,Integer> mapPort = new HashMap<>();

    public  void send(byte[] toByteArray) {
        for (Channel channel : channels) {
            channel.writeAndFlush(Unpooled.copiedBuffer(toByteArray));
        }
    }

    public  void directSend(Channel channel, ByteBuf buf){
        // 查询当前注册监听这个端口的channel
    }

    // 获取本地的监听
    public void  registerChannel(Channel channel){

        String[] split = channel.localAddress().toString().split(":");
        listenPortapPort.put(Integer.parseInt(split[1]), channel);
    }

    // 映射当前的mapPOrt
    public void mapPort(ResRegiterPacket packet){
        mapPort.put(packet.getSelfPort(), packet.getListenPort());
    }

}
