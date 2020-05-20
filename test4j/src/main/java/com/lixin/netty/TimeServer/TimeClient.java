package com.lixin.netty.TimeServer;

public class TimeClient {
    public static void main(String[] args) {
        int port = 8000;
        if (args != null && args.length > 0){
            port = Integer.parseInt(args[0]);
        }
        new Thread(new TimeClientHandler("127.0.0.1",port),"Time Client001").start();
    }
}
