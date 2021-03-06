package com.lixin.stock.service;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WebClientService {

    private final WebClient webClient;
    Logger LOG = LoggerFactory.getLogger(WebClientService.class);

    public WebClientService() {

        webClient = new WebClient(BrowserVersion.CHROME);

        webClient.getOptions().setThrowExceptionOnScriptError(false);

        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);

        webClient.getOptions().setUseInsecureSSL(false);

        webClient.getOptions().setWebSocketEnabled(false);

        webClient.getOptions().setJavaScriptEnabled(false);

        webClient.getOptions().setActiveXNative(false);

        webClient.getOptions().setCssEnabled(false);

        webClient.getOptions().setThrowExceptionOnScriptError(false);

        webClient.waitForBackgroundJavaScript(10 * 1000);

        //禁止下载照片
        webClient.getOptions().setDownloadImages(false);

        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

    }

    public Optional<String> getPage(String url, long time) {
        try {
            System.out.println(url);
            HtmlPage page = webClient.getPage(url);


            webClient.waitForBackgroundJavaScript(time);

            return Optional.of(page.asText());
        } catch (Exception e) {
            LOG.error(ExceptionUtils.getStackTrace(e));
            return Optional.empty();
        }

    }
}
