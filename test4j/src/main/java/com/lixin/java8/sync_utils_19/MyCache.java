package com.lixin.java8.sync_utils_19;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁 读可以并行 写不可以
 */
public class MyCache {
    private Map<String,Object> map = new HashMap<>();
    private ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    private Lock readLock = readWriteLock.readLock();
    private Lock writeLock = readWriteLock.writeLock();

    public Object get(String key){
        readLock.lock();
        try {
            return map.get(key);
        }finally {
            readLock.unlock();
        }
    }

    public Object put(String key,Object object){
        writeLock.lock();
        try {
            return map.put(key, object);
        }finally {
            writeLock.unlock();
        }
    }



}
