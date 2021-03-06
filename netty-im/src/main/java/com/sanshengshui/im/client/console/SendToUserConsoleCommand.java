package com.sanshengshui.im.client.console;

import com.sanshengshui.im.protocol.request.MessageRequestPacket;
import io.netty.channel.Channel;


import java.util.Scanner;

public class SendToUserConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个某个用户ID：");

        String toUserId = scanner.next();
        System.out.print("输入发送的消息：");
        String message = scanner.next();
        channel.writeAndFlush(new MessageRequestPacket(toUserId, message));
    }
}
