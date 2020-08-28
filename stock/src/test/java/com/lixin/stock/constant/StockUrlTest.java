package com.lixin.stock.constant;

import cn.hutool.http.HttpUtil;
import org.junit.Test;

import static org.junit.Assert.*;

public class StockUrlTest {

    @Test
    public void testSouhu(){
        String s = HttpUtil.get(StockUrl.ifeng);
        System.out.println(s);
    }

}