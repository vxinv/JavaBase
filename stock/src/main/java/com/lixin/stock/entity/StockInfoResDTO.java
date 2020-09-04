package com.lixin.stock.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockInfoResDTO {
    private StockInfoData data;

    private int error_code;

    private String error_description;

}
