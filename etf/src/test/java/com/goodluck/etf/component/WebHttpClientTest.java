package com.goodluck.etf.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WebHttpClientTest {


    @Autowired
    WebHttpClient client;

    @Test
    public void realTimeGet() {
        System.out.println(client.realTimeGet("sh512690"));
    }
}
