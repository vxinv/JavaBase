package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 基因
 */
@Data
@NoArgsConstructor
public class Gene {

    // M10 短期 M30 M60 M120 移动平均线
    // 交易周期
    int[] timeRank = {3, 7, 14, 20, 30, 40, 50, 60, 70, 80, 90, 100, 150, 200};
    // 市场排名等级
    int[] marketSizeRank = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // 低于平均值
    float[] highOrLowRank = {0.1F, 0.15F, 0.2F, 0.25F, 0.3F, 0.35F, 0.4F, 0.45F, 0.5F};
    // 高于或低于当前的价格的周
    int[] lowOrHeihtWeek = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};

    int timePeriod;
    int pursueHigh;
    int pursueLow;
    int marketSize;


}
