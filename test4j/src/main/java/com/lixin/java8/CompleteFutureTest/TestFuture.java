package com.lixin.java8.CompleteFutureTest;

import io.netty.util.concurrent.CompleteFuture;
import junit.framework.TestCase;

import javax.sound.midi.SoundbankResource;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class TestFuture extends TestCase {

    public static ExecutorService executor = Executors.newFixedThreadPool(3,new NamedThreadFactory());

    static Supplier<Integer> externalTask = () -> delayRandom(20, 2000);

    static Supplier<Integer> externalTask2Time = () ->{
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {

        }
        return 1;
    };

    static Supplier<Integer> externalTask3Time = () ->{
        try {
            System.out.println(Thread.currentThread().getName()+"等待3秒开始");
            Thread.sleep(3*1000);
            System.out.println(Thread.currentThread().getName()+"等待3秒结束");
        } catch (InterruptedException e) {

        }
        return 1;
    };

    static Supplier<Integer> externalTask4Time = () ->{
        try {
            Thread.sleep(2*1000);
        } catch (InterruptedException e) {

        }
        return 1;
    };

    static Supplier<Integer> externalTask1Time = () ->{
        try {
            Thread.sleep(1*1000);
        } catch (InterruptedException e) {

        }
        return 1;
    };

    public void test_run_async (){
        for (int i = 0; i < 100; i++) {
            CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(externalTask, executor);
            integerCompletableFuture.whenComplete((r,throwable)->{
                System.out.println(r+"ms end");
            });
        }
        try {
            Thread.sleep(0x186a0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断是否是回头执行
     * 3+2
     * 4
     */
    public void test_run_back (){
        CompletableFuture.supplyAsync(externalTask3Time,executor).thenApplyAsync((f)->{
            System.out.println(f);
            try {
                System.out.println(Thread.currentThread().getName()+"等待2秒开始");
                Thread.sleep(2*1000);
                System.out.println(Thread.currentThread().getName()+"等待2秒开始");
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            return 12;
        },executor).thenApplyAsync((g)->{
             System.out.println(g);
            try {
                System.out.println(Thread.currentThread().getName()+"等待1秒开始");
                Thread.sleep(1*1000);
                System.out.println(Thread.currentThread().getName()+"等待1秒开始");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 15;
        },executor);

        try {
            Thread.sleep(20*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    /**
     * 模拟外部任务
     */
    private static Random rnd = new Random();

    static int delayRandom(int min,int max){
        int milli = max > min ? rnd.nextInt(max - min) : 0;
        try {
            Thread.sleep(milli);
        } catch (InterruptedException e) { }
        return milli;
    }

    public void  test_run_loop(){
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            Future<String> submit = executor.submit(() -> {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName());
                countDownLatch.countDown();
                return Thread.currentThread().getName();
            });
        }
        try {
            countDownLatch.await();
            System.out.println("end");
        } catch (InterruptedException e) {
            System.out.println("response interrupt");
            e.printStackTrace();
        }
    }


}
