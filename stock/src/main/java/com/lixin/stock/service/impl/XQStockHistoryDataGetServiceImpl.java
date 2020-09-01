package com.lixin.stock.service.impl;

import cn.hutool.core.text.StrFormatter;
import cn.hutool.http.HttpUtil;
import com.lixin.stock.constant.StockUrl;
import com.lixin.stock.entity.XQStockData;
import com.lixin.stock.model.StockData;
import com.lixin.stock.service.StockHistoryDataGetService;
import com.lixin.stock.utils.JsonUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;


/*基于雪球的股票数据获取*/
@Service
public class XQStockHistoryDataGetServiceImpl implements StockHistoryDataGetService {

    boolean hasLogin = false;

    public static void main(String[] args) {
        List<StockData> historyList = new XQStockHistoryDataGetServiceImpl().getHistoryList("000063");
        System.out.println(historyList);
    }

    /**
     * 获取最近三年的股票前复权数据
     *
     * @param code 股票代码
     * @return 三年的数据
     */
    public List<StockData> getHistoryList(String code) {
        if (!hasLogin) {
            HttpUtil.get("https://xueqiu.com/");
            hasLogin = true;
        }
        /*根据code判断深圳或上海*/
        String pcode;
        if (code.startsWith("0")) {
            pcode = "SZ" + code;
        } else {
            pcode = "SH" + code;
        }

        String url = StrFormatter.format(StockUrl.xq_day_K_scode_tcode, pcode, String.valueOf(System.currentTimeMillis()), 7);
        String body = HttpUtil.get(url);

        XQStockData xqStockData = JsonUtil.convertJsonStringToObject(body, XQStockData.class);
        List<StockData> stockData = new ArrayList<>();
        for (List<String> list : xqStockData.getData().getItem()) {
            StockData sd = new StockData();
            Instant instant = Instant.ofEpochMilli(Long.parseLong(list.get(0)));
            sd.setTime(LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalDate());
            sd.setTradeVolume(Long.parseLong(list.get(1)));
            sd.setOpenPrice(BigDecimal.valueOf(Double.parseDouble(list.get(2))));
            sd.setHighestPrice(BigDecimal.valueOf(Double.parseDouble(list.get(3))));
            sd.setLowestPrice(BigDecimal.valueOf(Double.parseDouble(list.get(4))));
            sd.setClosePrice(BigDecimal.valueOf(Double.parseDouble(list.get(5))));
            sd.setRangePrice(BigDecimal.valueOf(Double.parseDouble(list.get(6))));
            sd.setRangeRate(valueF(list.get(7)));
            sd.setTurnoverRate(BigDecimal.valueOf(Double.parseDouble(list.get(8))));
            sd.setTradeMoney(Float.parseFloat(list.get(9)));
            sd.setCode(code);
            stockData.add(sd);
        }
        return stockData;
    }

    private float valueF(Object o) {
        return Float.parseFloat(String.valueOf(o));
    }


}
