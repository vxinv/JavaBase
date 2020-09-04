package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class StockInfoData {
    private int count;

    private List<StockInfoList> list;

}
