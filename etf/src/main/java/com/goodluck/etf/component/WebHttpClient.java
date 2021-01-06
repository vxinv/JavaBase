package com.goodluck.etf.component;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.http.HttpRequest;
import com.goodluck.etf.entity.RealTimeData;
import org.springframework.stereotype.Component;

/**
 * 获取股票信息的http client
 */
@Component("client")
public class WebHttpClient {


    /**
     * @param code etf 代码 带字母
     * @return RealTimeData
     */
    public RealTimeData realTimeGet(String code) {
        // https://qt.gtimg.cn/q=sh512690&1609911149109
        String formatUrl = StrFormatter.format("https://qt.gtimg.cn/q={}&{}", code, System.currentTimeMillis());
        String body = HttpRequest.get(formatUrl)
                .header("Host", "qt.gtimg.cn")
                .header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:84.0) Gecko/20100101 Firefox/84.0")
                .header("Accept", "*/*")
                .header("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2")
                .header("Accept-Encoding", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.13; rv:84.0) Gecko/20100101 Firefox/84.0")
                .header("Connection", "keep-alive")
                .header("Referer", "https://gu.qq.com/sh512690?pgv_ref=fi_smartbox&_ver=2.0")
                .execute().body();
        //System.out.println(body);
        String[] sps = body.split("~");
       /* for (int i = 0; i < sps.length; i++) {
            System.out.println("--"+i+"--"+sps[i]);
        }*/
        RealTimeData rtd = new RealTimeData();
        rtd.setCurrent(Double.parseDouble(sps[3]));
        rtd.setLast_close(Double.parseDouble(sps[4]));
        rtd.setOpen(Double.parseDouble(sps[5]));
        rtd.setHigh(Double.parseDouble(sps[33]));
        rtd.setLow(Double.parseDouble(sps[34]));
        rtd.setVolume(Integer.parseInt(sps[36]));// 元
        rtd.setAmount(Integer.parseInt(sps[37]));// 万
        return rtd;
    }

}


