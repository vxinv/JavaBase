package com.lixin.stockGain;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lixin.constant.StockUrl;
import com.lixin.entity.StockInfo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/*基于雪球的股票数据获取*/
@Service
public class XQStockGetClient {

    boolean hasLogin = false;

    /*获取最近三年的股票前复权数据*/
    public  List<StockInfo> getHistoryList(String code){
        if (!hasLogin){
            HttpUtil.get("https://xueqiu.com/");
            hasLogin = true;
        }
        /*根据code判断深圳或上海*/
        String pcode;
        if (code.startsWith("0")){
            pcode = "SZ"+code;
        }else {
            pcode = "SH"+code;
        }
        String url =  StrFormatter.format(StockUrl.xq_day_K_scode_tcode, pcode,String.valueOf(System.currentTimeMillis()));

        /*System.out.println(url);*/

        //String url = StrFormatter.format(StockUrl.xq_day_K_scode_tcode,code,)
        String body = HttpUtil.get(url);
        /*System.out.println(body);*/
        JSONObject jsonObject = JSON.parseObject(body);
        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray item = data.getJSONArray("item");
        ArrayList<StockInfo> stockInfos = new ArrayList<>();
        for (Object o : item) {

           JSONArray array = (JSONArray) o;
           /*"timestamp","volume","open","high","low","close","chg","percent","turnoverrate","amount","volume_post","amount_post","pe","pb","ps","pcf","market_capital","balance","hold_volume_cn","hold_ratio_cn","net_volume_cn","hold_volume_hk","hold_ratio_hk","net_volume_hk"*/
           /*1583424000000,96545533,open 50.52,high  51.3,low  50.02,close 50.86,chg -1.05,percent -2.02, turnoverrate 2.74,
           amount 4.895831044E9,null,null,53.2633,5.98,2.578,59.9495,2.3456663996026E11,null,null,null,null,null,null,null*/
            StockInfo stockInfo = new StockInfo();
            /*获取时间 时间戳转换为时间*/
            stockInfo.setRtime(new Date((Long) array.get(0)));

            stockInfo.setTradeVolume((Integer) array.get(1));
            /*开盘价*/
            stockInfo.setOpenPrice(valueF(array.get(2)));
            /*最高价格*/
            stockInfo.setHightestPrice(valueF(array.get(3)));
            /*最低价格*/
            stockInfo.setLowestPrice(valueF(array.get(4)));
            /*收盘价*/
            stockInfo.setClosePrice(valueF(array.get(5)));
            /*涨额*/
            stockInfo.setRangePrice(valueF(array.get(6)));
            /*涨幅*/
            stockInfo.setRangeRate(valueF(array.get(7)));
            /*换手率*/
            stockInfo.setTurnoverRate(valueF(array.get(8)));

            stockInfo.setCode(code);

            stockInfos.add(stockInfo);

        }
        return stockInfos;
    }

    private float  valueF(Object o){
       return Float.parseFloat(String.valueOf(o));
    }

   /* public static void main(String[] args) {
        List<HistoryStockInfo> historyList = getHistoryList("000063");
    }*/


}
