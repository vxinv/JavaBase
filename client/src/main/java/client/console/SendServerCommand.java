package client.console;


import com.xinu.XinJson.Xgson;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;


import java.util.Scanner;

public class SendServerCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        System.out.println("向服务器发送消息");

        String next = scanner.next();

        channel.writeAndFlush(Unpooled.copiedBuffer(next.getBytes()));

        System.out.println("发送完毕");

    }
}
