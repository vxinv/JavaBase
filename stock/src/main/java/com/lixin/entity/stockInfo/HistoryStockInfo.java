package com.lixin.entity.stockInfo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class HistoryStockInfo {

    public LocalDate time;
    public double openingPrice;
    public double closingPrice;
    public double rangePrice;
    public double rangeRate;
    public double lowestPrice;
    public double highestPrice;
    public double tradeVolume;
    public float tradeMoney;
    public double turnoverRate;

   /* public static HistoryStockInfo build(String[] strings){
        HistoryStockInfo hs = new HistoryStockInfo();
        hs.time = strings[0];
        hs.openingPrice = strings[1];
        hs.closingPrice = strings[2];
        hs.rangePrice = strings[3];
        hs.rangeRate = strings[4];
        hs.lowestPrice = strings[5];
        hs.highestPrice = strings[6];
        hs.tradeVolume = strings[7];
        hs.tradeMoney = strings[8];
        hs.turnoverRate = strings[9];

        return hs;
    }*/


}
