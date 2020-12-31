package com.lixin.stock.constant;

import cn.hutool.http.HttpUtil;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.util.Cookie;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class StockUrlTest {

    @Test
    public void testSouhu() {
        String s = HttpUtil.get(StockUrl.ifeng);
        System.out.println(s);
    }


    @Test
    public void getCategory2() {
        //http://stockpage.10jqka.com.cn/000876/
        String s = HttpUtil.get("http://basic.10jqka.com.cn/000876/field.html");
        System.out.println(s);
    }

    @Test
    public void connNet() throws Exception {
        String str;
        // 创建一个webclient
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        // htmlunit 对css和javascript的支持不好，所以请关闭之
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        // 获取页面
        HtmlPage page = webClient.getPage("http://fund.eastmoney.com/data/fundranking.html#tgp;c0;r;szzf;pn50;ddesc;qsd20191229;qed20201229;qdii;zq;gg;gzbd;gzfs;bbzt;sfbb");
        // 获取页面的TITLE

        str = page.getTitleText();
        System.out.println(str);
        // 获取页面的XML代码
        str = page.asXml();
        System.out.println(str);
        // 获取页面的文本
        str = page.asText();
        System.out.println(str);
        // 关闭webclient
        //webClient.close();
    }

    /**
     * 获取某个页面的cookie
     */

    @Test
    public void testGetCookies() throws IOException {
        WebClient webClient = new WebClient(BrowserVersion.CHROME);
        // htmlunit 对css和javascript的支持不好，所以请关闭之
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);

        Page page = webClient.getPage("http://fund.eastmoney.com/data/fundranking.html#tall;c0;r;szzf;pn50;ddesc;qsd20191231;qed20201231;qdii;zq;gg;gzbd;gzfs;bbzt;sfbb");

        Page text = webClient.getPage("https://fundapi.eastmoney.com/fundtradenew.aspx?ft=gp&sc=1n&st=desc&pi=1&pn=100&cp=&ct=&cd=&ms=&fr=&plevel=&fst=&ftype=&fr1=&fl=0&isab=1");
        System.out.println(text.getWebResponse().getContentAsString());


        Page fund = webClient.getPage("http://fundf10.eastmoney.com/ccmx_000001.html");
        //System.out.println(fund.getWebResponse().getContentAsString());

        Document doc = Jsoup.parse(fund.getWebResponse().getContentAsString());
        Elements select = doc.select("#cctable > div:nth-child(1) > div > table");
        System.out.println(select.html());


        Set<Cookie> cookies = webClient.getCookieManager().getCookies();
        for (Cookie cookie : cookies) {
            System.out.println(cookie);
        }
    }

    /**
     * 对 http请求添加cookie
     */
    @Test
    public void testHttpUtils() throws IOException {
        Connection connect = Jsoup.connect("http://fund.eastmoney.com/data/fundranking.html#tall;c0;r;szzf;pn50;ddesc;qsd20191231;qed20201231;qdii;zq;gg;gzbd;gzfs;bbzt;sfbb");
        Connection.Response execute = connect.execute();
        Map<String, String> cookies = execute.cookies();

        for (Map.Entry<String, String> stringStringEntry : cookies.entrySet()) {
            System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
        }
    }


    @Test
    public void getFundInfo() {


    }


}
