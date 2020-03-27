package com.lixin.java8.concurrencyBase_16;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用显示条件进行协作的示例
 */
public class demoCondition  extends Thread{
    private volatile  boolean  fire= false;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    @Override
    public void run() {
        try {
            lock.lock();
            System.out.println("start");
            try {
                while (!fire) {
                    condition.await();
                }
            }finally {
                lock.unlock();
            }
            System.out.println("fired");
        }catch (InterruptedException e){
            Thread.interrupted();
        }
    }

    public  void fired(){
        lock.lock();
        try {
            this.fire = true;
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        demoCondition demoCondition = new demoCondition();
        demoCondition.start();
        System.out.println("start demo");
        demoCondition.fired();

    }
}
