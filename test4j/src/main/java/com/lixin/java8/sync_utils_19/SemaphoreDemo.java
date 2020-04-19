package com.lixin.java8.sync_utils_19;

import java.util.concurrent.Semaphore;

/**
 * 资源往往有很多个 限制并发的访问数量
 * Semaphore
 */
public class SemaphoreDemo {
    private static final int MAX_PERMITS = 100;
    private Semaphore permits = new Semaphore(MAX_PERMITS,true);
    public boolean login(String name,String password) throws Exception {
        if(!permits.tryAcquire()){
            // 同时登陆的数量超过限制
            throw new Exception();
        }
        return true;
    }

    public void logout(String name){
        permits.release();
    }
}
