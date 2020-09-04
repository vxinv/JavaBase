package com.lixin.stock.constant;

import cn.hutool.http.HttpUtil;
import org.junit.Test;

public class StockUrlTest {

    @Test
    public void testSouhu() {
        String s = HttpUtil.get(StockUrl.ifeng);
        System.out.println(s);
    }


    @Test
    public void getCategory2() {
        //http://stockpage.10jqka.com.cn/000876/
        String s = HttpUtil.get("http://basic.10jqka.com.cn/000876/field.html");
        System.out.println(s);
    }


}