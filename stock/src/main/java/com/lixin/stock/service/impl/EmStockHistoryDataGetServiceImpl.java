package com.lixin.stock.service.impl;

/**
 * 东方财富证券 获取的


 public class EmStockHistoryDataGetServiceImpl implements StockHistoryDataGetService {
 HttpRequest httpRequest;
 WebClient webClient = new WebClient(BrowserVersion.FIREFOX_60);
 Logger log = LoggerFactory.getLogger(EmStockHistoryDataGetServiceImpl.class);
 boolean hasLogin = false;

 // 通过东方财富证券获取三年的历史数据
 /*public static void main(String[] args) throws InterruptedException {
 //new DFStockGetClient().login();
 //4f1862fc3b5e77c150a2b985b12db0fd
 HttpUtil.get(StockUrl.eastmoney);
 String format = StrFormatter.format(StockUrl.em_day_K_token_code_time, StockUrl.em_token, StockUrl.em_stock_code, System.currentTimeMillis());

 String s = HttpUtil.get(format);
 //去掉jsonp1583409970070(
 String substring = s.substring(19, s.length() - 1);
 //解析json 获取日K线 开盘 收盘 最高 最低 成交量 成交额 振幅
 JSONObject jsonObject = JSON.parseObject(substring);
 JSONArray data = jsonObject.getJSONArray("data");
 //获取最近三年的
 int fi = data.size() > (365 * 3) ? data.size() - (365 * 3) : (365 * 3);
 List<Object> objects = data.subList(fi, data.size());
        for (Object object : objects) {
            String item = (String) object;
            System.out.println(item);
            //逗号分隔
            String[] split = item.split(",");
            //组装对象
            System.out.println(item);
            StockData sd = new StockData();
            sd.setTime(TimeProcess.string2Date(split[0]));
 sd.setOpenPrice(NumberConvertUtil.string2Decimal(split[1]));
 sd.setClosePrice(NumberConvertUtil.string2Decimal(split[2]));
 sd.setHighestPrice(NumberConvertUtil.string2Decimal(split[3]));
 sd.setLowestPrice(NumberConvertUtil.string2Decimal(split[4]));
 //sd.setTradeVolume(Integer.parseInt(split[5]));
 sd.setTradeMoney(Float.parseFloat(split[6]));
 sd.setTurnoverRate(NumberConvertUtil.string2Decimal(split[7].substring(0, split[7].length() - 1)));
 }

 }
 *//*http://pdfm.eastmoney.com/EM_UBG_PDTI_Fast/api/js
    ?token=4f1862fc3b5e77c150a2b985b12db0fd
    &rtntype=6
    &id=0000632
    &type=k
    &authorityType=fa
    &cb=jsonp1583403519130*//*

    public List<StockData> getHistoryList(String code) {

        if (!hasLogin) {
            HttpUtil.get("https://xueqiu.com/");
            hasLogin = true;
        }

        String scode = code + "2";
        String format = StrFormatter.format(StockUrl.em_day_K_token_code_time, StockUrl.em_token, scode, System.currentTimeMillis());
        String s = HttpUtil.get(format);
        *//*去掉jsonp1583409970070(*//*
        String substring = s.substring(19, s.length() - 1);
        *//*解析json 获取日K线*//*
 *//*开盘 收盘 最高 最低 成交量 成交额 振幅*//*
        JSONObject jsonObject = JSON.parseObject(substring);
        JSONArray data = jsonObject.getJSONArray("data");
        //获取最近三年的
        int fi = data.size() > (365 * 3) ? data.size() - (365 * 3) : (365 * 3);
        List<Object> objects = data.subList(fi, data.size());
        ArrayList<StockData> stockData = new ArrayList<>();
        for (Object object : objects) {
            String item = (String) object;
            System.out.println(item);
            //逗号分隔
            String[] split = item.split(",");
            //组装对象
            System.out.println(item);
            StockData sd = new StockData();
            sd.setTime(TimeProcess.string2Date(split[0]));
            sd.setOpenPrice(NumberConvertUtil.string2Decimal(split[1]));
            sd.setClosePrice(NumberConvertUtil.string2Decimal(split[2]));
            sd.setHighestPrice(NumberConvertUtil.string2Decimal(split[3]));
            sd.setLowestPrice(NumberConvertUtil.string2Decimal(split[4]));
            sd.setTradeVolume(Long.parseLong(split[5]));
            sd.setTradeMoney(Float.parseFloat(split[6]));
            sd.setTurnoverRate(NumberConvertUtil.string2Decimal(split[7].substring(0, split[7].length() - 1)));
            stockData.add(sd);
        }
        return stockData;
    }*/




