package com.lixin.stock.utils;

import java.math.BigDecimal;

public class NumberConvertUtil {
    public static BigDecimal string2Decimal(String value){
        return BigDecimal.valueOf(Double.parseDouble(value));
    }
}
