package com.lixin.java8.sync_utils_19;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author 李鑫
 * @version 1.0
 * @date 2020/4/19 17:12
 * @weather 晴
 * @mood 好
 * @recentThings 回家
 */

/**
 * 19.4
 * 所有的线程都到达后在一起通过 是可以循环的 可以用作重复的同步
 * countDownLunch 的参与角色不同 有的负责倒计时 有的在等待变为0
 */

public class cyclicbarrier_demo {
    static class Tourist extends Thread{
        // 循环屏障
        CyclicBarrier barrier;
        public Tourist(CyclicBarrier barrier){
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                // 模拟各自独立运行
                Thread.sleep((long) (Math.random()*1000));
                // 集合点A
                barrier.await();
                System.out.println(this.getName()+"arrived A " + System.currentTimeMillis());
                // 集合后模拟再独立运行
                Thread.sleep((long) (Math.random()*1000));
                barrier.await();
                System.out.println(this.getName()+"arrived B " + System.currentTimeMillis());

            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        int num  =  3;
        Tourist[] tourists = new Tourist[num];
        CyclicBarrier barrier = new CyclicBarrier(num, ()->{
            System.out.println("all arrived"+System.currentTimeMillis()+"executed by "+Thread.currentThread().getName());
        });
        for (int i = 0; i < num; i++) {
            tourists[i] = new Tourist(barrier);
            tourists[i].start();
        }

    }


}
