package com.lixin.stockGain.ShortTimeAnalysis;

import cn.hutool.http.HttpUtil;
import com.alibaba.fastjson.JSON;
import com.lixin.constant.StockUrl;
import com.lixin.entity.RealTimeInfo;
import com.lixin.utils.StockUtils;

import javax.sound.midi.SoundbankResource;
import java.util.ArrayList;
import java.util.List;

public class TXstockRealTime {


    /*从腾讯获取实时的交易数据*/
    public static void getStockShortTimeInfo(String stockCode){

        String sinfo = HttpUtil.get(StockUrl.tx_hour_info_plus + StockUtils.getSH(stockCode) + stockCode);
        String[] split = sinfo.split("~");

        RealTimeInfo info = RealTimeInfo.build(split);

        System.out.println(JSON.toJSONString(info));
    }

    public static void main(String[] args) {
            getStockShortTimeInfo("600036");
    }

    /**
     * v_sh600036="1~招商银行~600036~34.68~34.18~34.19~668298~345117~323181~34.68~613~34.67~3097~34.66~840~34.65~1007~34.64~346~34.69~149~34.70~703~34.71~177~
     * 34.72~180~34.73~531
     * ~~20200310154046~0.50~1.46~34.94~34.08~34.68/668298/2309858482~668298~230986~0.32~9.67~~34.94~34.08~2.52~7154.12~8746.24~1.56~37.60~30.76~0.79~4163~34.56~8.49~10.86~~~0.83~230985.85~0.00~0~ ~GP-A~-7.72~~2.71~15.16~1.25";
     */


}
