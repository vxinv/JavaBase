package com.lixin.java8.numberProcess;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class TestBifDecimal {

    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(BigDecimal.valueOf(12.32323232)));
    }
}
