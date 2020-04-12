package com.lixin.java8.concurrencyBase_16.demoComsumeProducer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 定义两个等待条件 不满 不空 显式等待条件 需要先获取锁
 * put时 如果队列满 在notFull 等待 put操作后通知 notEmpty
 * take时 如果队列空 在notEmpty 等待 take操作后 通知notFull
 * 这样 代码清晰易读 避免不必要的唤醒和检查 提高效率
 */
public class demoConditionBlockingQueue<E> {

    private Queue<E> queue = null;
    private int limit;
    private Lock lock = new ReentrantLock();

    private Condition notFull = lock.newCondition();
    private Condition notEmpty = lock.newCondition();

    public demoConditionBlockingQueue(int limit) {
        this.limit = limit;
        queue = new ArrayDeque<>();
    }

    public void put(E e) throws  InterruptedException{
        lock.lockInterruptibly();
        try {
            while (queue.size() == limit){
                // await在进入等待队列后 会释放锁 释放cpu
                notFull.await();
            }
            queue.add(e);
            notEmpty.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public E take() throws InterruptedException{
        lock.lockInterruptibly();
        try {
            while (queue.isEmpty()){
                notEmpty.await();
            }
            E poll = queue.poll();
            notFull.signalAll();
            return poll;
        }finally {
            lock.unlock();
        }
    }

}







