package com.lixin.java8.concurrencyBase_16.demoAccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * tryLock 避免死锁 持有一个锁 获取另外一个锁
 * 获取不到的时候 可以释放已经获得的锁
 */
public class Account {
    private Lock lock = new ReentrantLock();
    private volatile double money;

    public Account(double money) {
        this.money = money;
    }

    public void add(double money){
        lock.lock();
        try {
            this.money+=money;
        }finally {
            lock.unlock();
        }
    }

    public void reduce(double money){
        lock.lock();
        try {
            this.money-=money;
        }finally {
            lock.unlock();
        }

    }

    public double getMoney(){
        return money;
    }

    void lock(){
        lock.lock();
    }

    void unlock(){
        lock.unlock();
    }

    boolean tryLock(){
        return lock.tryLock();
    }



}
