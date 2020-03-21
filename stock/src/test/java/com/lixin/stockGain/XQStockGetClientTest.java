package com.lixin.stockGain;

import com.google.common.collect.Lists;
import com.lixin.StockApplication;
import com.lixin.dao.SimStockInfoDao;
import com.lixin.dao.StockInfoDao;
import com.lixin.entity.SimStockInfo;
import com.lixin.entity.StockInfo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;



@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
class XQStockGetClientTest {

    @Autowired
    XQStockGetClient client;

    @Autowired
    StockInfoDao stockInfoDao;

    @Autowired
    SimStockInfoDao simStockInfoDao;

    @Test
    public void getHistoryList() {
        List<StockInfo> historyList = client.getHistoryList("000063");
        for (StockInfo stockInfo : historyList) {
            stockInfoDao.insert(stockInfo);
        }
    }

    @Test
    /*添加数据*/
    public void dataFull1(){

        List<SimStockInfo> simStockInfos = simStockInfoDao.selectList(null);
            for (SimStockInfo simStockInfo : simStockInfos) {
                     /*通过股票代码添加数据库*/
            try {
                List<StockInfo> historyList = client.getHistoryList(simStockInfo.getCode());
                System.out.println("添加"+simStockInfo.getComName()+"今天的数据");
                //System.out.println(JSON.toJSONString(historyList));
                List<StockInfo> reverse = Lists.reverse(historyList);
                for (int i = 0; i < 2; i++) {
                    stockInfoDao.insert(reverse.get(i));
                }

            }catch (Exception e){
                System.out.println(simStockInfo.getComName()+"添加失败");
            }
        }
   }

        @Test
        public void  testXQ(){
            for (int i = 0; i < 10000; i++) {
                client.getHistoryList("000063");
                System.out.println("第"+i+"次获取");
            }

        }





}



