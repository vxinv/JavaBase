package com.lixin.entity.stockInfo;

import lombok.Data;

@Data
public class RealTimeStockInfo {

     public String stockName;
     public String todayTheOpening;
     public String yesterdayClosingPrice;
     public String theCurrentPrice;
     public String todayTheHighestPrice;
     public String todayLowestPrice;
     public String theCurrentBidPrice;
     public String theCurrentSellingRate;
     public String theSharesOfClinchADeal;
     public String clinchADealAmount;
     public String buyANumber;
     public String buyAQuotation;
     public String buyTwoNumber;
     public String buyTwoQuotations;
     public String buyThreeNumber;
     public String buyThreeQuotations;
     public String buyFourNumber;
     public String buyFourQuotation;
     public String buyFiveNumber;
     public String buyFiveQuotations;
     public String sellANumberOf;
     public String sellAQuotation;
     public String sellTwoNumber;
     public String sellTwoQuotations;
     public String sellThreeNumber;
     public String sellThreeQuotations;
     public String sellFourNumber;
     public String sellFourQuotation;
     public String sellFiveNumber;
     public String sellFiveQuotations;
     public String theDateOf;
     public String time;

    public static RealTimeStockInfo build(String var){
     String[] split = var.split("=");
     String[] str = split[1].split(",");
     RealTimeStockInfo rl = new RealTimeStockInfo();
     rl.stockName = str[0];
     rl.todayTheOpening = str[1];
     rl.yesterdayClosingPrice =str[2];
     rl.theCurrentPrice=str[3];
     rl.todayTheHighestPrice=str[4];
     rl.todayLowestPrice=str[5];
     rl.theCurrentBidPrice=str[6];
     rl.theCurrentSellingRate=str[7];
     rl.theSharesOfClinchADeal=str[8];
     rl.clinchADealAmount=str[9];
     rl.buyANumber=str[10];
     rl.buyAQuotation=str[11];
     rl.buyTwoNumber=str[12];
     rl.buyTwoQuotations=str[13];
     rl.buyThreeNumber=str[14];
     rl.buyThreeQuotations=str[15];
     rl.buyFourNumber=str[16];
     rl.buyFourQuotation=str[17];
     rl.buyFiveNumber=str[18];
     rl.buyFiveQuotations=str[19];
     rl.sellANumberOf=str[20];
     rl.sellAQuotation=str[21];
     rl.sellTwoNumber=str[22];
     rl.sellTwoQuotations=str[23];
     rl.sellThreeNumber=str[24];
     rl.sellThreeQuotations=str[25];
     rl.sellFourNumber=str[26];
     rl.sellFourQuotation=str[27];
     rl.sellFiveNumber=str[28];
     rl.sellFiveQuotations=str[29];
     rl.theDateOf=str[30];
     rl.time=str[31];
     return rl;
    }

}
