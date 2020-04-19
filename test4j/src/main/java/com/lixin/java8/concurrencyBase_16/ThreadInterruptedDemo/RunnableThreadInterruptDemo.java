package com.lixin.java8.concurrencyBase_16.ThreadInterruptedDemo;

public class RunnableThreadInterruptDemo extends Thread{
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            // 单次循环
            System.out.println("IO run");
        }
        System.out.println("done ");
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableThreadInterruptDemo runnableThreadInterruptDemo = new RunnableThreadInterruptDemo();
        runnableThreadInterruptDemo.start();
        //Thread.sleep(1000);
        System.out.println(runnableThreadInterruptDemo.getState());
        runnableThreadInterruptDemo.interrupt();
    }
}
