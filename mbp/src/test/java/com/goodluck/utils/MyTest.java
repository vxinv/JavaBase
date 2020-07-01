package com.goodluck.utils;

import com.goodluck.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.annotation.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) //AccountPlatApplication 为启动类
public interface MyTest {
}
