package com.lixin.java8.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

    @Test
    public void testGetIpAddress() throws UnknownHostException {
        System.out.println(InetAddress.getByName("stackoverflow.com").getHostAddress());
    }
}
