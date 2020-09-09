package com.lixin.stock.utils;


import java.math.BigDecimal;

public class StockUtil {

    /**
     * 计算流通市值
     */
    public static BigDecimal computerFlowCapital(int volume, float turnoverrate, BigDecimal closePrice) {
        float flowStockNum = volume / turnoverrate;
        return closePrice.multiply(BigDecimal.valueOf(flowStockNum));
    }

    /**
     * 代码华威数字
     */

    public static Integer code2int(String code) {
        Integer re = 0;
        String chartwo = code.substring(0, 2);
        String number = code.substring(2);

        if (chartwo.equals("SZ")) {
            re += 10000000;
        } else {
            re += 11000000;
        }
        re += Integer.parseInt(number);
        return re;
    }

    public static String int2code(int code) {
        StringBuilder sb = new StringBuilder();
        if (code > 11000000) {
            sb.append("SH");
            code -= 11000000;
        } else {
            sb.append("SZ");
            code -= 1000000;
        }
        sb.append(code);
        return sb.toString();
    }


    public static void main(String[] args) {
        Integer sh600214 = code2int("SH600214");
        System.out.println(sh600214);
        String s = int2code(sh600214);
        System.out.println(s);
    }
}

