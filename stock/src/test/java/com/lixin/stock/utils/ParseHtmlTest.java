package com.lixin.stock.utils;

import com.lixin.stock.StockApplication;
import com.lixin.stock.mapper.IndustrySimpleMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = StockApplication.class)
public class ParseHtmlTest {

    @Autowired
    IndustrySimpleMapper industrySimpleMapper;

    @Test
    public void initIndustry() {
        new ParseHtml().getHangye(industrySimpleMapper);
    }
}