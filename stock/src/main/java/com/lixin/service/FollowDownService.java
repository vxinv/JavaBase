package com.lixin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import com.lixin.dao.SimStockInfoDao;
import com.lixin.dao.StockInfoDao;
import com.lixin.entity.SimStockInfo;
import com.lixin.entity.StockInfo;
import com.lixin.utils.StockUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.concurrent.*;

/**
 * 追跌服务
 */
@Service
public class FollowDownService {

    @Autowired
    SimStockInfoDao simStockInfoDao;

    @Autowired
    StockInfoDao stockInfoDao;

    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    int p = 5;

    /*追跌服务*/
    /*
    * 检测持续下跌的股票
    * 1连续几天
    * 2n天m天
    * 3当前价格为开跌的价格比例
    * 板块
    * */
    public List<Object> getSustainDownStock(Integer susDay,
                                            Integer n,
                                            Integer m,
                                            Float ratio,
                                            String indus){

        // 获取全部的股票
        List<SimStockInfo> simStockInfos = simStockInfoDao.selectList(null);
        QueryWrapper<StockInfo> stockInfoQueryWrapper = new QueryWrapper<>();
        List<List<SimStockInfo>> partition = Lists.partition(simStockInfos, simStockInfos.size()/5);
        CountDownLatch countDownLatch = new CountDownLatch(p);
        ExecutorService executorService = Executors.newFixedThreadPool(p);
        /*分配给不同的线程去执行*/
        for (int i = 0; i < p; i++) {
            Integer finalI = i;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    List<SimStockInfo> part = partition.get(finalI);
                    part.forEach(stockInfo ->{
                        /*对单个进行处理 获取该股票最近一年的数据*/
                        QueryWrapper<StockInfo> stockInfoQueryWrapper1 = new QueryWrapper<StockInfo>().eq("code", stockInfo.getCode()).orderByDesc("rtime");
                        List<StockInfo> stockInfos = stockInfoDao.selectList(stockInfoQueryWrapper1);
                        //System.out.println("开始分析"+stockInfo.getCode()+"个股");
                        /*对数据进行分析*/
                        dataProcess(stockInfos);
                    });
                    countDownLatch.countDown();
                    System.out.println("任务"+finalI+"执行完毕，一共计算了"+part.size()+"条数据");
                }
            };
            Future<?> submit = executorService.submit(runnable);
        }
        try {
            countDownLatch.await();
            System.out.println("执行完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 对数据进行处理
     */
    public void  dataProcess(List<StockInfo> stockInfos){
        List<StockInfo> reverse = Lists.reverse(stockInfos);
        /*记录下跌的次数*/
        float dowmNum = 0.01F;
        /*记录上涨的次数*/
        float upNum = 0.01F;
        /*涨跌次数的比率*/
        float upDownRatio = 1F;
        /*最小的下跌百分比*/
        float downPriceRatio = 0.8F;
        /*最大累计次数*/
        int maxTotalNum = 30;
        /*抄底后持有的最大天数*/
        int maxHoldDays = 4;
        /*抄底的第一个上涨幅度*/
        float rangeRate = 0.2F;
        /*盈利的次数*/
        int gain = 0;
        /*亏损的次数*/
        int loss = 0;
        /**/
        /*避免空*/
        for (int i = 0; i < reverse.size()-1; i++) {
            /*当前的股价信息*/
            StockInfo currStockInfo = reverse.get(i);
            /*如果当天的的股价 小于 后一天的股价信息*/
            if (StockUtils.averagePrice(currStockInfo) < StockUtils.averagePrice(reverse.get(i+1))){
                dowmNum += 1;
            }else {
                upNum +=1;
            }
            /*不可累计超过Q次*/
            if (upNum + dowmNum > maxTotalNum){
                /*次数清零 重新开始*/
                upNum = dowmNum = 0.01F;
                continue;
            }
            /*比较当前下跌和上涨的比率    假设八天有六天是跌 二天涨  不允许有两天涨 为3*/
            if (dowmNum / upNum < upDownRatio){
                continue;
            }
            /*获取开始下跌的 价格*/
            float preStockPrice = StockUtils.averagePrice(reverse.get(i+1-((int)(upNum + dowmNum))));
            /* 如果不满足 连续下跌 ——> 计算是否满足下跌到的幅度 ——> 默认为原价的70%以下 */
            if (StockUtils.averagePrice(currStockInfo) > preStockPrice*downPriceRatio){
                continue;
            }
            /*计算模拟买入的价格 因为对每个个股的监控 假设在大幅下跌后可以在第一个上涨的情况下买入*/
            if (reverse.get(i+1).getRangeRate() < rangeRate){
                continue;
            }
            /*记录模拟买入时的价格 默认收盘价格*/
            float buyPrice = reverse.get(i+1).getOpenPrice();

            int  z ;
            /*计算持有天数内上涨的概率 */
            if (i+2+maxHoldDays >= reverse.size()-1){
                z = reverse.size()-1;
            }
            z = i+2+maxHoldDays;
            for (int j = i+2; j < z; j++) {
                if (StockUtils.averagePrice(reverse.get(j)) > buyPrice){
                    System.out.println("当前日期"+formatter.format(reverse.get(j).getRtime()));
                    System.out.println("股票代码"+reverse.get(j).getCode()+"在抄底持有"+(j-(i+1))+"盈利");
                    /*记录成功抄底的次数*/
                    gain += 1;

                }
                /*记录失败的次数*/
                System.out.println("当前日期"+formatter.format(reverse.get(j).getRtime()));
                System.out.println("股票代码"+reverse.get(j).getCode()+"在抄底持有"+(j-(i+1))+"亏损");
                loss +=1;
            }

            /*全部清零 重新开始监控*/
            upNum = dowmNum = 0.01F;
            i = z;
        }


    }
}




















