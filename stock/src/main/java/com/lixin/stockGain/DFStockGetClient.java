package com.lixin.stockGain;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.Page;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.util.Cookie;
import com.lixin.constant.StockUrl;
import com.lixin.entity.stockInfo.HistoryStockInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * 东方财富证券 获取的
 */
public class DFStockGetClient {

    /**
     * 常量 会保存每次获取的cookie和token
     */
    HttpRequest httpRequest;

    WebClient webClient = new WebClient(BrowserVersion.FIREFOX_60);

    Logger log  = LoggerFactory.getLogger(DFStockGetClient.class);
    /*请求时需要的cookie 保存状态*/


    /*获取日线*/

    /*获取时线*/

    /*获取实时价格*/

    /*模拟登录*/
    public void login(){
        try {
            Page page = webClient.getPage("http://quote.eastmoney.com/concept/sz000063.html#fschart-k");
            Set<Cookie> cookies = page.getEnclosingWindow().getWebClient().getCookieManager().getCookies();
            log.info("获取的cookie{}", JSON.toJSONString(cookies));
            for (Cookie cookie : cookies) {
                System.out.println(cookie.getName());
            }
        } catch (IOException e) {
            log.error("请求出错", e);
        }
    }
    /*http://pdfm.eastmoney.com/EM_UBG_PDTI_Fast/api/js
    ?token=4f1862fc3b5e77c150a2b985b12db0fd
    &rtntype=6
    &id=0000632
    &type=k
    &authorityType=fa
    &cb=jsonp1583403519130*/

    public static List<HistoryStockInfo> getHistoryList(String code){

        HttpUtil.get(StockUrl.eastmoney);
        String scode = code+"2";
        String format = StrFormatter.format(StockUrl.em_day_K_token_code_time, StockUrl.em_token, scode,
                System.currentTimeMillis());
        String s = HttpUtil.get(format);
        /*去掉jsonp1583409970070(*/
        String substring = s.substring(19, s.length() - 1);
        /*解析json 获取日K线*/
        /*开盘 收盘 最高 最低 成交量 成交额 振幅*/
        JSONObject jsonObject = JSON.parseObject(substring);
        JSONArray data = jsonObject.getJSONArray("data");
        /*获取最近三年的*/
        int fi = data.size()>(365*3)?data.size()-(365*3):(365*3);
        List<Object> objects = data.subList(fi, data.size());
        ArrayList<HistoryStockInfo> historyStockInfos = new ArrayList<>();
        for (Object object : objects) {
            String item = (String) object;
            /*System.out.println(item);*/
            /*逗号分隔*/
            String[] split = item.split(",");
            /*组装对象*/
            System.out.println(item);
            HistoryStockInfo historyStockInfo = new HistoryStockInfo();
            historyStockInfo.time = LocalDate.parse(split[0], StockUrl.dateFormat);
            historyStockInfo.openingPrice = Double.parseDouble(split[1]);
            historyStockInfo.closingPrice = Double.parseDouble(split[2]);
            historyStockInfo.highestPrice =Double.parseDouble(split[3]);
            historyStockInfo.lowestPrice =Double.parseDouble(split[4]);
            historyStockInfo.tradeVolume = Double.parseDouble(split[5]);
            historyStockInfo.tradeMoney = Float.parseFloat(split[6]);

            historyStockInfos.add(historyStockInfo);
            //historyStockInfo.turnoverRate = Double.parseDouble(split[7]);
            /**/

        }
        return historyStockInfos;
    }

   /* public static void main(String[] args) throws InterruptedException {
        //new DFStockGetClient().login();
        *//*4f1862fc3b5e77c150a2b985b12db0fd*//*
        HttpUtil.get(StockUrl.eastmoney);
        String format = StrFormatter.format(StockUrl.em_day_K_token_code_time, StockUrl.em_token, StockUrl.em_stock_code, System.currentTimeMillis());
        String s = HttpUtil.get(format);
        *//*去掉jsonp1583409970070(*//*
        String substring = s.substring(19, s.length() - 1);
        *//*解析json 获取日K线*//*
        *//*开盘 收盘 最高 最低 成交量 成交额 振幅*//*
        JSONObject jsonObject = JSON.parseObject(substring);
        JSONArray data = jsonObject.getJSONArray("data");
        *//*获取最近三年的*//*
        int fi = data.size()>(365*3)?data.size()-(365*3):(365*3);
        List<Object> objects = data.subList(fi, data.size());
        for (Object object : objects) {
            String item = (String) object;
            *//*System.out.println(item);*//*
            *//*逗号分隔*//*
            String[] split = item.split(",");
            *//*组装对象*//*
            System.out.println(item);
            HistoryStockInfo historyStockInfo = new HistoryStockInfo();
            historyStockInfo.time = LocalDate.parse(split[0], StockUrl.dateFormat);
            historyStockInfo.openingPrice = Double.parseDouble(split[1]);
            historyStockInfo.closingPrice = Double.parseDouble(split[2]);
            historyStockInfo.highestPrice =Double.parseDouble(split[3]);
            historyStockInfo.lowestPrice =Double.parseDouble(split[4]);
            historyStockInfo.tradeVolume = Double.parseDouble(split[5]);
            historyStockInfo.tradeMoney = Float.parseFloat(split[6]);

            //historyStockInfo.turnoverRate = Double.parseDouble(split[7]);
            *//**//*

        }

    }*/


}


