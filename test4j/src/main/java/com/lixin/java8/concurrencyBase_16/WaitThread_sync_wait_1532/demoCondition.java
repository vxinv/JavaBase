package com.lixin.java8.concurrencyBase_16.WaitThread_sync_wait_1532;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用显示条件进行协作的示例
 * 调用await 之前需要先获取锁 释放cpu
 *
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
                // 等待的条件 变为假
                while (!fire) {
                    System.out.println("进入等待");
                    /**
                     * await 返回后 不代表等待的条件已经满足了
                     */
                    condition.await();
                    // 当前线程状态
                    System.out.println("当前线程状态"+Thread.currentThread().getState().name());
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
            System.out.println("满足条件");
            //this.fire = true;
            System.out.println("唤醒在条件等待的线程");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        demoCondition demoCondition = new demoCondition();
        demoCondition.start();
        System.out.println("start demo");
        Thread.sleep(2000);
        demoCondition.fired();
    }
}
