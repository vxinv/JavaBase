package com.goodluck.etf.service;

import cn.hutool.core.text.StrFormatter;
import com.goodluck.etf.common.CommonString;
import com.goodluck.etf.component.Chrome;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class RealTimeInfoService {
    private static final Logger log = LoggerFactory.getLogger(RealTimeInfoService.class);


    String pattern = "\\{[\\s\\S]+\\}";

    Pattern r = Pattern.compile(pattern);


    @Autowired
    Chrome chrome;


    public void realTimeInfo(String etfCode) {
        String webUrl = StrFormatter.format(CommonString.WebPageEtfUrl, etfCode);
        WebDriver web = this.chrome.go(webUrl);
        String jsonUrl = StrFormatter.format(CommonString.JsonEtfUrl, etfCode, System.currentTimeMillis());
        // 获取json
        web.get(jsonUrl);
        String pageSource = web.getPageSource();
        Matcher m = r.matcher(pageSource);
        System.out.println(m.matches());

        /*RealTimeInfoVo realTimeVo = JsonUtil.convertJsonStringToObject(web.getPageSource(), RealTimeInfoVo.class);
        System.out.println(JsonUtil.jsonObj2Sting(realTimeVo));*/
    }

    /**
     * 修改使用腾讯证券
     * https://qt.gtimg.cn/q=sh512690&1609911149109
     */


}
