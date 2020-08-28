//package com.lixin.stock.utils;
//
//import com.lixin.stock.entity.StockInfo;
//
///*股票的基本数据处理*/
//public class StockUtils {
//
//    /*获取当天的均价*/
//    public  static float averagePrice(StockInfo stockInfo){
//        return (stockInfo.getLowestPrice()+stockInfo.getHightestPrice())/2;
//    }
//
//    /*获取股票的地点 腾讯大写*/
//    public static String getSH(String code){
//        if (code.startsWith("6")){
//            return "sh";
//        }
//        return "sz";
//    }
//
//
//}
