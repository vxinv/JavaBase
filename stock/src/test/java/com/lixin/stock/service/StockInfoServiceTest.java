//package com.lixin.stock.github.vxinv.service;
//
//import com.alibaba.fastjson.JSON;
//import com.lixin.stock.StockApplication;
//import com.lixin.stock.dao.SimStockInfoDao;
//import com.lixin.stock.dao.StockInfoDao;
//import com.lixin.stock.entity.SimStockInfo;
//import com.lixin.stock.entity.StockInfo;
//import com.lixin.stock.github.vxinv.utils.TimeProcess;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.Date;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = StockApplication.class)
//class StockInfoServiceTest {
//
//    @Autowired
//    StockInfoService stockInfoService;
//
//    @Autowired
//    StockInfoDao stockInfoDao;
//
//    @Autowired
//    SimStockInfoDao simStockInfoDao;
//
//
//    @Test
//    void getRangeLimit() {
//        List<StockInfo> rangeLimit = stockInfoService.getRangeLimit("2020-03-11", 9.8F);
//
//        System.out.println(JSON.toJSONString(rangeLimit));
//    }
//
//    /*分析涨停板的概率*/
//    @Test
//    void  getUpLimitP(){
//        List<StockInfo> currList = null;
//        int N = 4;
//        float range = 9.8F;
//        for (int n = N; n >= 0; n--) {
//            List<StockInfo> rangeLimit = stockInfoService.getRangeLimit(TimeProcess.getPreTime(n), range);
//
//            if (currList == null){
//                currList = rangeLimit;
//            }
//           /* *//*找到N天前的*//*
//            for (StockInfo stockInfo : currList) {
//                if (currList)
//            }*/
//        }
//    }
//
//    public static void main(String[] args) {
//        Date date = new Date();
//
//    }
//
//
//    @Test
//    void getRangeLimit1() {
//    }
//
//    @Test
//    void getProbSustainUpLimit() {
//        int[] ints = new int[30];
//        List<SimStockInfo> simStockInfos = simStockInfoDao.selectList(null);
//        for (SimStockInfo simStockInfo : simStockInfos) {
//            int[] probSustainUpLimit = stockInfoService.getProbSustainUpLimit(simStockInfo.getCode());
//            for (int i = 0; i < ints.length; i++) {
//                ints[i] += probSustainUpLimit[i];
//            }
//        }
//        for (int i = 0; i < ints.length; i++) {
//            System.out.println("连续"+i+"天涨停的次数"+ints[i]);
//        }
//    }
//
//    @Test
//    void getStockDataFromPreToToday() {
//        List<SimStockInfo> simStockInfos = simStockInfoDao.selectList(null);
//        for (int i = simStockInfos.size() - 1; i >= 0; i--) {
//            SimStockInfo simStockInfo = simStockInfos.get(i);
//            List<StockInfo> stockDataFromPreToToday = stockInfoService.getStockDataFromPreToTodayAscTime(simStockInfo.getCode(), 90);
//            /*获得最近三天连续涨停的*/
//            /*获得最近三天连续涨停的*/
//            boolean nDaySustainUpLimit = stockInfoService.getNDaySustainUpLimit(stockDataFromPreToToday, 3, 0);
//            if (!nDaySustainUpLimit){
//                simStockInfos.remove(simStockInfo);
//            }
//            boolean nDaySustainUpLimit5 = stockInfoService.getNDaySustainUpLimit(stockDataFromPreToToday, 5, 0);
//            if (!nDaySustainUpLimit5){
//                simStockInfos.remove(simStockInfo);
//            }
//
//        }
//        System.out.println(JSON.toJSONString(simStockInfos));
//    }
//}
