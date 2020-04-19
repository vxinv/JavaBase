package com.lixin.java8.ThreadPoolTest;

import junit.framework.TestCase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolTest  extends TestCase {

    public void test_poll(){
        //new ThreadPoolExecutor(5,4,)
        // corePollSize 核心线程
        // maximumPollSize 最大线程个数
        // keepAliveTime 空闲线程存活时间

        ExecutorService executor = Executors.newFixedThreadPool(5);
        ExecutorService executorService = Executors.newSingleThreadExecutor();

    }

}
