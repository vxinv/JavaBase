package proxy.protocal.rsp;

import lombok.Data;

/**
 * 客户端去注册要转发流量的端口
 *  |魔数 4 |指令 1 |序列方式 1|数据字节数 4|数据 |
 *
 *
 */

@Data
public class ResRegiterPacket {
    Integer selfPort;
    Integer listenPort;
}


