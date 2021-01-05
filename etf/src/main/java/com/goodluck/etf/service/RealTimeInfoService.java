package com.goodluck.etf.service;

import cn.hutool.core.text.StrFormatter;
import com.goodluck.etf.common.CommonString;
import com.goodluck.etf.component.Chrome;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RealTimeInfoService {
    private static final Logger log = LoggerFactory.getLogger(RealTimeInfoService.class);

    @Autowired
    Chrome chrome;


    public void realTimeInfo(String etfCode) {
        String webUrl = StrFormatter.format(CommonString.WebPageEtfUrl, etfCode);
        WebDriver web = this.chrome.go(webUrl);
        String jsonUrl = StrFormatter.format(CommonString.JsonEtfUrl, etfCode, System.currentTimeMillis());
        // 获取json
        System.out.println(jsonUrl);
        web.get(jsonUrl);
        System.out.println(web.getPageSource());
        /*RealTimeInfoVo realTimeVo = JsonUtil.convertJsonStringToObject(web.getPageSource(), RealTimeInfoVo.class);
        System.out.println(JsonUtil.jsonObj2Sting(realTimeVo));*/
    }
}
