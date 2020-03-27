package com.lixin.java8.concurrencyCollection_17;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * HashMap 不是并发安全的 在并发更新的时 可能发生死循环
 */
public class HashMapNotSafeDemo_17_1 {
    public static void main(String[] args) throws InterruptedException {

        final Map<Integer,Integer> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(){
                Random rnd  = new Random();
                @Override
                public void run() {
                    for (int i1 = 0; i1 < 1000; i1++) {
                        map.put(rnd.nextInt(),1);
                    }
                }
            };
            thread.start();
            thread.join();
        }

    }

}
