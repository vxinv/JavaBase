package com.lixin.java8.concurrencyBase_16.ThreadInterruptedDemo;

public class WaittingThreadIsInterruptedDemo extends  Thread {

    /**
     * 线程调用join/wait/sleep 方法会进入Waiting / TimedWaiti 状态
     * 对线程对象 调用interrupt 方法会使该线程抛出InterruptException
     * 线程抛出异常后 中断标志位会被清空
     */

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("interrupt");
                break;
            }
        }
        System.out.println("done");
    }

    public static void main(String[] args) throws InterruptedException {
        WaittingThreadIsInterruptedDemo threadIsInterruptedDemo = new WaittingThreadIsInterruptedDemo();
        threadIsInterruptedDemo.start();
        Thread.sleep(2000);
        threadIsInterruptedDemo.interrupt();
        Thread.sleep(2000);
    }
}
