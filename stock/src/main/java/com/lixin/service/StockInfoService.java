package com.lixin.service;

import cn.hutool.core.collection.CollectionUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.google.common.collect.Lists;
import com.lixin.dao.StockInfoDao;
import com.lixin.entity.StockInfo;
import com.lixin.utils.StockUtils;
import com.lixin.utils.TimeProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StockInfoService {

    @Autowired
    StockInfoDao stockInfoDao;

    /*得到当天涨停的股票*/
    public List<StockInfo> getRangeLimit(String date,float range){
        QueryWrapper<StockInfo> gt = new QueryWrapper<StockInfo>().eq("rtime", TimeProcess.getPreTime(0)).gt("range_rate", range);
        List<StockInfo> stockInfos = stockInfoDao.selectList(gt);
        return  stockInfos;
    }


    /**
     * 计算股市 连续涨停的可能持续几天
     * @param code  股票代码
     * @return 数组的索引是连续涨停的天数
     */
    int[] getProbSustainUpLimit(String code){
        QueryWrapper<StockInfo> stockInfoQueryWrapper = new QueryWrapper<StockInfo>().eq("code", code).gt("rtime", "2019-02-02").orderByAsc("rtime");
        List<StockInfo> stockInfos = stockInfoDao.selectList(stockInfoQueryWrapper);
        int[] ints = new int[30];
        int     num = 0;
        boolean canSum = false;
        for (int i = 0; i < stockInfos.size(); i++) {
            /*如果下一次是涨停 记录 保证当天高开 高走*/
            canSum = stockInfos.get(i).getRangeRate() > 9.8F ;
            if (canSum){
                num += 1;
            }else {
                /*在 数字清零开始重新计算的时候 记录当前涨停N天的次数*/
                if (num >= 1){
                    ints[num] ++;
                }
                num = 0;
            }
        }
        return ints;
    }

    /**
     * 获取从据今天的某个股票的数据
     * @param code 代码
     * @Param days  据今天天数
     */
    public  List<StockInfo>   getStockDataFromPreToTodayAscTime(String code,int days){

        // 获取最近三个月的数据
        String preTime = TimeProcess.getPreTime(90);
        QueryWrapper<StockInfo> stockInfoQueryWrapper = new QueryWrapper<StockInfo>().eq("code", code).gt("rtime", preTime).orderByAsc("rtime");
        List<StockInfo> stockInfos = stockInfoDao.selectList(stockInfoQueryWrapper);
        return stockInfos;

    }

    /**
     * 获得均线
     * @param stockInfos
     * @param period
     */
    public void getAverageLine(List<StockInfo> stockInfos,int... period){


        int  size = stockInfos.size();
        /*五日均线*/
        float[] k5 = new float[size - 5];
        /*循环 获取*/
        for (int i = 0; i < k5.length; i++) {
            k5[i] = getAverageKline(stockInfos, 5, i);
        }

        /*十日均线*/
        float[] k10 = new float[size - 10];
        /*循环 获取*/
        for (int i = 0; i < k10.length; i++) {
            k5[i] = getAverageKline(stockInfos, 10, i);
        }

        /*二十日均线*/
        float[] k20 = new float[size - 20];
        /*循环 获取*/
        for (int i = 0; i < k20.length; i++) {
            k5[i] = getAverageKline(stockInfos, 20, i);
        }



    }

    /**
     *
     * @param stockInfos  数据
     * @param n 连续涨停
     * @param m 可以不涨停的次数
     * @return
     */
   public boolean getNDaySustainUpLimit(List<StockInfo> stockInfos,int n,int m){
       /*从第n天开始计算*/
       boolean has = true;
       int k = 0 ;
       if (CollectionUtil.isEmpty(stockInfos)){
           return false;
       }
       int init = stockInfos.size() - n ;
       for (int i = init; i < stockInfos.size(); i++) {
           /*当前的涨幅是否大于9.8F*/
           if (stockInfos.get(i).getRangeRate() > 9.8F){
               continue;
           }
           /*如果没拉到涨停 但是可以有M次的不跌次数*/
           if (stockInfos.get(i).getRangeRate() >= 0F ){
               k++;
           }
           if (k > m){
               has = false;
               break;
           }
           /*如果跌*/
           if (stockInfos.get(i).getRangeRate() < 0F){
               has = false;
               break;
           }
       }
       return has;
   }

    /**
     * 获取某个的均线
     * @param stockInfos 数据源
     * @param p 周期
     * @param n 距今天数
     * @return
     */
    public float getAverageKline (List<StockInfo> stockInfos, int  p,int n){
        float sum = 0 ;
        int  size = stockInfos.size();
        for (int i = 1; i <= p; i++) {
            sum += StockUtils.averagePrice(stockInfos.get(size - i - n));
        }
        return sum/p;
    }



}





















