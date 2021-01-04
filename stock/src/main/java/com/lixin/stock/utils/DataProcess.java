package com.lixin.stock.utils;

import com.lixin.stock.entity.SortStockInfo;
import com.lixin.stock.model.StockNdata;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

import java.time.LocalDate;
import java.util.List;

/**
 * 数据的基本处理 去重
 */
public class DataProcess {

    static StandardDeviation variance = new StandardDeviation();
    static Mean mean = new Mean();

    public static List<StockNdata> Deduplication(List<StockNdata> stockNdatas) {
        LocalDate lastTime = null;
        for (int i = stockNdatas.size() - 1; i >= 0; i--) {
            StockNdata stockNdata = stockNdatas.get(i);
            if (lastTime == null) {
                lastTime = stockNdata.getTimestamp();
                continue;
            }
            if (lastTime.equals(stockNdata.getTimestamp())) {
                stockNdatas.remove(i);
            }
            lastTime = stockNdata.getTimestamp();
        }
        return stockNdatas;
    }

    /**
     * 提取一段时间的总成交量 价格方差
     *
     * @return
     */
    public static SortStockInfo extractKeyData(List<StockNdata> stockNdatas) {
        if (stockNdatas.size()==0){
            return new SortStockInfo();
        }
        double[] prices = new double[stockNdatas.size()];
        double[] volumes = new double[stockNdatas.size()];
        for (int i = 0; i < stockNdatas.size(); i++) {
            StockNdata stockNdata = stockNdatas.get(i);
            prices[i] = (stockNdata.getOpen().add(stockNdata.getClose()).doubleValue() / 2);
            volumes[i] = Double.valueOf(stockNdata.getVolume());
        }
        // 获取均值
        double[] averageLine = getAverageLine(stockNdatas);

        SortStockInfo ssi = new SortStockInfo();
        ssi.setCode(stockNdatas.get(0).getCode());
        ssi.setVolume(mean.evaluate(volumes));
        ssi.setVariance(variance.evaluate(prices)/mean.evaluate(prices));
        ssi.setA5(averageLine[0]);
        ssi.setA20(averageLine[1]);
        ssi.setSeaTurtleLine(Math.abs(averageLine[0]-averageLine[1]));
        return ssi;
    }

    /**
     * 求极差
     *
     * @param arr
     * @return
     */
    public static double getRange(double[] arr) {
        double max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    /**
     * 提取均线
     */
    public  static  double[] getAverageLine(List<StockNdata> sds){
        double a20 = 0;
        double a5 = 0;
        double[] a = {0,0};
        int k = 0 ;
        for (int i = sds.size() - 1; i >= 0; i--) {
            StockNdata sd = sds.get(i);
            if (k < 5){
                a5 += sd.getClose().doubleValue();
            }
            if (k < 20){
                a20+= sd.getClose().doubleValue();
            }
            k ++;
            if ( k >=20){
                a[0] = a5/5;
                a[1] = a20/20;
                break;
            }
        }
        return a;
    }

}
