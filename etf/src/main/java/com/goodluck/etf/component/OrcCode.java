package com.goodluck.etf.component;

/**
 * 百度验证码识别 自动登录
 */


import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;

@Component
public class OrcCode {

    @Value("${orc.APP_ID}")
    public String APP_ID = "";
    @Value("${orc.API_KEY}")
    public String API_KEY = "";
    @Value("${orc.SECRET_KEY}")
    public String SECRET_KEY = "";

    AipOcr client;

    @PostConstruct
    public void init() {
        // 初始化一个AipOcr
        client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 可选：设置网络连接参数
        client.setConnectionTimeoutInMillis(2000);
        client.setSocketTimeoutInMillis(60000);

        // 可选：设置代理服务器地址, http和socket二选一，或者均不设置
        //client.setHttpProxy("proxy_host", proxy_port);  // 设置http代理
        //client.setSocketProxy("proxy_host", proxy_port);  // 设置socket代理

        // 可选：设置log4j日志输出格式，若不设置，则使用默认配置
        // 也可以直接通过jvm启动参数设置此环境变量
        //System.setProperty("aip.log4j.conf", "path/to/your/log4j.properties");

        // 调用接口
    }


    public String discrern() {
        String path = "test.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
        return res.toString(2);
    }
}
