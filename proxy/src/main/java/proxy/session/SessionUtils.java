package proxy.session;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.util.LinkedHashSet;

// 会话管理
public class SessionUtils {
   public static LinkedHashSet<Channel> channels = new LinkedHashSet<>();

    public static void send(byte[] toByteArray) {
        for (Channel channel : channels) {
            channel.writeAndFlush(Unpooled.copiedBuffer(toByteArray));
        }
    }
}
