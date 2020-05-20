package com.lixin.netty.TimeServer;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

public class MultiplexerTimeServer  implements  Runnable{

    private Selector selector;

    private ServerSocketChannel serverSocketChannel;

    private volatile  boolean stop;

    /**
     * 初始化 多路复用器
     * @param port
     */
    public MultiplexerTimeServer(int port) {

        try {
            selector = Selector.open();
            serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.socket().bind(new InetSocketAddress(port),1024);
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("The timserver is start in port "+ port);

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void stop(){
        this.stop =  true;
    }

    @Override
    public void run() {

        while (!stop){
            try {
                selector.select(1000);
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                Iterator<SelectionKey> iterator = selectionKeys.iterator();

                SelectionKey key =  null;
                while (iterator.hasNext()){
                    key = iterator.next();
                    iterator.remove();
                    try {
                        handleInput(key);
                    }catch (Exception e){
                        if (key != null){
                            key.cancel();
                            if (key.channel() != null){
                                key.channel().close();
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 多路复用器关闭后 所有注册在上面的Channel 和 Pipe等资源 都会去注册
        if (selector != null){
            try {
                selector.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }

    private void handleInput(SelectionKey key) throws  IOException{
        if (key.isValid()){
            // 处理新接入的消息
            if (key.isAcceptable()){
                // Accept new Connection
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept();
                sc.configureBlocking(false);
                // Add the new connection to the seleltor
                sc.register(selector,SelectionKey.OP_READ);
            }
            if (key.isReadable()){
                // Read the data
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                int readBytes = sc.read(allocate);
                if (readBytes > 0 ){
                    allocate.flip();
                    byte[] bytes = new byte[allocate.remaining()];
                    allocate.get(bytes);
                    String body = new String(bytes, "UTF-8");
                    System.out.println("The time server receive order :" + body);
                    String currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ? new Date(System.currentTimeMillis()).toString():"BAD ORDER";
                    doWrite(sc,currentTime);
                }else if(readBytes < 0){
                    key.cancel();
                    sc.close();
                }
            }
        }
    }

    private void doWrite(SocketChannel sc, String res) throws IOException {
        if (res != null && res.trim().length() != 0){
            byte[] bytes = res.getBytes();
            ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
            allocate.put(bytes);
            allocate.flip();
            sc.write(allocate);
        }
    }
}
