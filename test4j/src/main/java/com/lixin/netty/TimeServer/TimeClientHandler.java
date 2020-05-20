package com.lixin.netty.TimeServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

public class TimeClientHandler  implements Runnable {

    private String host;
    private int port;
    private Selector selector;
    private SocketChannel socketChannel;
    private volatile  boolean stop;

    public TimeClientHandler(String s, int port) {
        this.host = s;
        this.port = port;

        try {
            selector = Selector.open();
            socketChannel = SocketChannel.open();
            socketChannel.configureBlocking(false);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    @Override
    public void run() {

        try {
            doConnect();
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        while (!stop){
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> it = selectionKeys.iterator();

                SelectionKey key = null;
                while (it.hasNext()){
                    key = it.next();
                    it.remove();
                    try {
                        handleInput(key);

                    }catch (Exception e){
                        if (key != null){
                            key.cancel();
                            if (key.channel()!= null){
                                key.channel().close();
                            }
                        }
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
                System.exit(1);
            }
        }
        // 多路复用器关闭
        if (selector != null){
            try {
                selector.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void doConnect() throws IOException {
        if (socketChannel.connect(new InetSocketAddress(host,port))){
            socketChannel.register(selector,SelectionKey.OP_READ);
            doWrite(socketChannel);
        }else {
            socketChannel.register(selector,SelectionKey.OP_CONNECT);
        }
    }

    private void handleInput(SelectionKey key) throws IOException {
        if (key.isValid()){
            // 判断链接是否成功
            SocketChannel channel = (SocketChannel) key.channel();
            if (key.isConnectable()){
                if (channel.finishConnect()){
                    channel.register(selector,SelectionKey.OP_READ);
                    doWrite(channel);
                }
            }else {
                System.exit(1);
            }

            if (key.isReadable()){
                ByteBuffer readBuffer = ByteBuffer.allocate(1024);
                int read = channel.read(readBuffer);
                if (read > 0){
                    readBuffer.flip();
                    byte[] bytes = new byte[readBuffer.remaining()];
                    readBuffer.get(bytes);
                    String str = new String(bytes,"UTF8");
                    System.out.println("Now is" + str);
                    this.stop = true;
                }else if (read < 0){
                    key.cancel();
                    channel.close();
                }

            }
        }
    }

    private void doWrite(SocketChannel sc) throws IOException {

            byte[] res = "QUERY TIME ORDER".getBytes();
            ByteBuffer allocate = ByteBuffer.allocate(res.length);
            allocate.put(res);
            allocate.flip();
            sc.write(allocate);

    }
}
