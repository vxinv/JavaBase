package proxy.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import proxy.session.SessionUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

@ChannelHandler.Sharable

public class PacketCodecHandler extends MessageToMessageCodec<ByteBuf, String> {

    public static final PacketCodecHandler INSTANCE = new PacketCodecHandler();

    private PacketCodecHandler() {

    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf byteBuf, List<Object> out) throws IOException {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        SessionUtils.channels.add(ctx.channel());

        while (byteBuf.isReadable()){

            byteBuf.readBytes(byteArrayOutputStream,byteBuf.readableBytes());

        }
        String result = byteArrayOutputStream.toString();

        SessionUtils.send(byteArrayOutputStream.toByteArray());

        System.out.println("接受的数据"+result);

        out.add(result);
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, String packet, List<Object> out) {
        ByteBuf byteBuf = ctx.channel().alloc().ioBuffer();
        byteBuf.writeBytes(packet.getBytes());
        out.add(byteBuf);
    }
}
