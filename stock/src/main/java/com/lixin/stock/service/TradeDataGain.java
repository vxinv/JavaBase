package com.lixin.stock.service;

import cn.hutool.http.HttpUtil;
import org.junit.jupiter.api.Test;


/*
    获得实时数据
 */
public class TradeDataGain {


    /*public List<HistoryStockInfo> getHistoryPrice(String stockCode ,String startTime ,String endTime){
        HashMap<String, Object> maps = new HashMap<>();
        maps.put("code","cn_"+ stockCode);
        maps.put("start",startTime);
        maps.put("end",endTime);
        maps.put("stat","1");
        maps.put("order","A");
        maps.put("type","before");
        maps.put("period","d");
        //maps.put("callback","historySearchHandler");
        maps.put("rt","json");
        String get = API.ME(API.HOST.sohu).addReqUrl(maps).GET();
        JSONArray array = (JSONArray) JSON.parse(get);
        JSONObject object = (JSONObject) array.get(0);
        JSONArray array1 = (JSONArray) object.get("hq");
        Iterator<Object> iterator = array1.iterator();
        ArrayList<HistoryStockInfo> dataArray = new ArrayList<>();
        while (iterator.hasNext()){
            JSONArray array2 = (JSONArray) iterator.next();
            // System.out.println(array2);
            String[] strings = array2.toArray(new String[array2.size()]);
            HistoryStockInfo hs = HistoryStockInfo.build(strings);
            dataArray.add(hs);
        }
        return  dataArray;
    }*/

    @Test
    public void getXueQiu(){
        String s = HttpUtil.get("https://xueqiu.com/");
        String s1 = HttpUtil.get("https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol=SZ002223&begin=1581083463759" +
                "&period=day&type=before&count=-322&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance");
        System.out.println(s1);

    }









        /**
         时间 * 今开价格* 收盘价格* 涨跌额* 涨跌幅* 最低价格* 最高价格* 成交量* 成交额* 换手率
         */
       /* List<HistoryStockInfo> historyPrice = getHistoryPrice("000078", "20150228", "20200204");
        System.out.println(historyPrice);*/


    /**
     * https://stock.xueqiu.com/v5/stock/chart/kline.json?symbol=SZ000078
     * &begin=1581074177143&period=day&type=before&count=-142&indicator=kline,pe,pb,ps,pcf,market_capital,agt,ggt,balance
     */

}
