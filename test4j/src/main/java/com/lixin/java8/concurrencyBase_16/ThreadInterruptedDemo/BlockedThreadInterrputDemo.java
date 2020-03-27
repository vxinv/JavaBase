package com.lixin.java8.concurrencyBase_16.ThreadInterruptedDemo;

/**
 * RUNNABLE 线程在运行或具备运行的条件 等待被调度
 * WAITING/TIMED_WAITTNG 线程在等待某个条件或超时
 * BLOCKED 线程在等待锁 试图进入同步块
 * NEW/TERMINATED 还没启动或结束
 */
public class BlockedThreadInterrputDemo {
    private static Object lock = new Object();
    private static class A extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                while (!Thread.currentThread().isInterrupted()){

                }
            }
            System.out.println("exit");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        synchronized (lock){
            A a = new A();
            a.start();
            Thread.sleep(1000);
            a.interrupt();
            a.join();
        }
    }
}
