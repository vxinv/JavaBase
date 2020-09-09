package com.lixin.stock.constant;

import java.time.format.DateTimeFormatter;

public class StockUrl {

    public static String sina = "http://hq.sinajs.cn/rn=cyei3&list=";

    public static String ifeng = "http://api.finance.ifeng.com/akdaily/?code=#{sh603806}&type=last";

    public static String eastmoney = "https://www.eastmoney.com/";

    public static String xueqiu = "https://xueqiu.com/";

    public static String em_day_K_token_code_time = "http://pdfm.eastmoney.com/EM_UBG_PDTI_Fast/api/js?token={}&rtntype=6&id={}&type=k&authorityType=fa&cb=jsonp{}";

    //https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol=SH603501&begin=1587005237663&period=day&type=before&count=-142&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance,macd,ma
    //https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol=SZ000876&begin=1599562290741&period=day&type=before&count=-284&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance
    public static String xq_day_K_scode_tcode = "https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol={}&begin={}&period=day&type=before&count=-{}&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance";

    public static String em_token = "4f1862fc3b5e77c150a2b985b12db0fd";

    public static String sohu = "http://q.stock.sohu.com/hisHq?stat=2&period=d&rt=json&code=cn_600256&start=20190212&end=20190228&order=A";

    /*http://img1.money.126.net/data/hs/klinederc/day/times/600062.json*/
    public static String wy = "http://img1.money.126.net/data/[沪深拼音]/[是否复权]/[周期]/times/[股票代码].json";


    public static String em_stock_code = "0000632";

    public static String em_time_code = "1583404589570";

    public static String tx_hour_info_plus = "http://qt.gtimg.cn/q=";

    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /*获取所有的行业信息*/
    /*http://q.10jqka.com.cn/thshy/index/field/199112/order/desc/page/1/ajax/1/*/
    /*http://q.10jqka.com.cn/thshy/index/field/199112/order/desc/page/2/ajax/1/*/
    public static String getIndusturyStockList = "http://q.10jqka.com.cn/thshy/index/field/199112/order/desc/page/{}/ajax/1/";

    /*获取该行业代码之内的所有行业*/
    public static String getAllStockByIndustryCode_page_code = "http://q.10jqka.com.cn/thshy/detail/field/199112/order/desc/page/{}/ajax/1/code/{}";

}
