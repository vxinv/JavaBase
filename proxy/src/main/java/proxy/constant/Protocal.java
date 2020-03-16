package proxy.constant;

import io.netty.util.AttributeKey;

public class Protocal {

    public static  AttributeKey<String> client = AttributeKey.newInstance("client");

    public static int MAGIC_NUMBER = 0x01;
    public static byte register_client = 0x02;
}
