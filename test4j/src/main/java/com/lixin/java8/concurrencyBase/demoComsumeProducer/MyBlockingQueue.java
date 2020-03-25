package com.lixin.java8.concurrencyBase.demoComsumeProducer;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 每个对象有一把锁和等待队列
 * 一个线程在进入synchronized 会尝试获取锁 获取不到会把当前线程放入等待队列
 * 除此之外 每个对象还有一个等待队列 wait会把当前对象放在条件队列阻塞  等待notify
 */
public class MyBlockingQueue<E> {
    private Queue<E>  queue = null;
    private int limit;

    public MyBlockingQueue(int limit) {
        this.limit = limit;
        queue = new ArrayDeque<>(limit);
    }
    public synchronized void put(E e) throws InterruptedException{
        while (queue.size() == limit){
            wait();
        }
        queue.add(e);
        notifyAll();
    }
    public synchronized E take() throws InterruptedException{
        while (queue.isEmpty()){
            wait();
        }
        E e = queue.poll();
        notifyAll();
        return e;
    }

}
