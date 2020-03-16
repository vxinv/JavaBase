package com.lixin.entity;

import lombok.Data;

@Data
public class RealTimeInfo {

    String stockName;
    String code;
    float  currentPrice;
    float  yesterdayClosedPrice;
    float  todayOpenPrice;/*今天开盘价*/
    int    turnover;/*成交量(手)*/
    int    theOuter;/*外盘*/
    int    theInner;/*内盘*/
    float  buyOne;
    int    buyOneNum;/*买一的数量*/
    float  buyTwo;
    int    buyTwoNum;
    float  buyThree;
    int    buyThreeNum;
    float  buyFour;
    int    buyFourNum;
    float  buyFive;
    int    buyFiveNum;
    float  sellOne;
    int    sellOneNum;/*买一的数量*/
    float  sellTwo;
    int    sellTwoNum;
    float  sellThree;
    int    sellThreeNum;
    float  sellFour;
    int    sellFourNum;
    float  sellFive;
    int    sellFiveNum;
    float  chg;/*涨跌*/
    float  increaseRatio;/*涨幅*/
    float  currHeight;
    float  currLow;
    float  vibration;/*振幅*/
    float  circulationMarketValue;/*流通市值*/
    float  totalMarketValue;/*总市值*/
    float  upLimit;/*涨停*/
    float  downLimit;/*跌停*/
    float  tradeRatio;/*量比*/
    float  averagePrice;/*均价*/
    float  pre;/*市盈率*/
    float  turnoverRate;/*换手率*/

    public  static  RealTimeInfo build(String info[]){

        RealTimeInfo realTimeInfo = new RealTimeInfo();
        realTimeInfo.stockName = info[1];
        realTimeInfo.code = info[2];
        realTimeInfo.currentPrice = stf(info[3]);
        realTimeInfo.yesterdayClosedPrice = stf(info[4]);
        realTimeInfo.todayOpenPrice = stf(info[5]);
        realTimeInfo.turnover = sti(info[6]);
        realTimeInfo.theOuter =  sti(info[7]);
        realTimeInfo.theInner =  sti(info[8]);
        realTimeInfo.turnoverRate = stf(info[38]);  /*换手率*/
        realTimeInfo.circulationMarketValue = stf(info[44]);/*单位 亿*/
        realTimeInfo.chg = stf(info[31]);  /*涨跌*/
        realTimeInfo.increaseRatio = stf(info[32]);  /*涨幅*/
        //realTimeInfo.averagePrice = stf()

        return realTimeInfo;


    }

    static float stf(String value){
        return Float.parseFloat(value);
    }

    static int sti(String value){
        return  Integer.parseInt(value);
    }
}
