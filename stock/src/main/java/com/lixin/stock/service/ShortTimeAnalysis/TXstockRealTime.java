//package com.lixin.stock.github.vxinv.service.ShortTimeAnalysis;
//
//import cn.hutool.http.HttpUtil;
//import com.lixin.stock.constant.StockUrl;
//import com.lixin.stock.entity.RealTimeInfo;
//import com.lixin.stock.github.vxinv.utils.Poster;
//import com.lixin.stock.github.vxinv.utils.StockUtils;
//import com.lixin.stock.github.vxinv.utils.YmlUtil;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class TXstockRealTime {
//
//
//    Logger log = LoggerFactory.getLogger(this.getClass());
//
//    /*从腾讯获取实时的交易数据*/
//    public static RealTimeInfo getStockShortTimeInfo(String StockNcode) {
//
//        String sinfo = HttpUtil.get(StockUrl.tx_hour_info_plus + StockUtils.getSH(StockNcode) + StockNcode);
//        String[] split = sinfo.split("~");
//        RealTimeInfo info = RealTimeInfo.build(split);
//        return info;
//    }
//
//    /*监控指定的股票 当出现涨幅不大于9.8F 通知*/
//    public void MoniterStock() throws InterruptedException {
//        Poster.send("股票提醒", "开始提醒");
//        List<String> StockNcodes = (List<String>) YmlUtil.get("stock.mlist", "stock");
//
//        while (StockNcodes.size()>0){
//            Thread.sleep(3*1000);
//            log.info("监控中[{}]",StockNcodes);
//            for (int i = StockNcodes.size() - 1; i >= 0; i--) {
//                String code = StockNcodes.get(i);
//                RealTimeInfo info = getStockShortTimeInfo(code);
//                if (info.getSellOne()!= 0 && info.getIncreaseRatio() < 3F){
//                    Poster.send("股票提醒", info.getStockName()+"当前涨幅"+info.getIncreaseRatio());
//                    StockNcodes.remove(code);
//                }
//            }
//
//        }
//        Poster.send("股票提醒", "结束提醒");
//
//
//    }
//
//   /* public static void main(String[] args) {
//            getStockShortTimeInfo("600036");
//    }*/
//
//    /**
//     * v_sh600036="1~招商银行~600036~34.68~34.18~34.19~668298~345117~323181~34.68~613~34.67~3097~34.66~840~34.65~1007~34.64~346~34.69~149~34.70~703~34.71~177~
//     * 34.72~180~34.73~531
//     * ~~20200310154046~0.50~1.46~34.94~34.08~34.68/668298/2309858482~668298~230986~0.32~9.67~~34.94~34.08~2.52~7154.12~8746.24~1.56~37.60~30.76~0.79~4163~34.56~8.49~10.86~~~0.83~230985.85~0.00~0~ ~GP-A~-7.72~~2.71~15.16~1.25";
//     */
//
//
//}
