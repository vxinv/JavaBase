package com.lixin.java8.concurrencyBase_16.ThreadInterruptedDemo;


/**
 * RUNNABLE 线程在运行或具备运行的条件 等待被调度
 * WAITING/TIMED_WAITTNG 线程在等待某个条件或超时 wait notity await signal
 * BLOCKED 线程在等待锁 试图进入同步块 等待锁 synchronized ReentrantLock
 * NEW/TERMINATED 还没启动或结束
 */
public class BlockedThreadInterrputDemo {
    private static Object lock = new Object();
    private static class A extends Thread{
        @Override
        public void run() {
            synchronized (lock){
                while (!Thread.currentThread().isInterrupted()){
                    System.out.println("not Interrupted");
                }
            }
            System.out.println("exit");
        }
    }

    /**
     * 如果线程在等待锁 对线程对象调用interrupt() 只会设置线程的标志位 线程依然会处于BLock状态
     * 不能使一个在等待锁的线程真正的中断
     * @param args
     * @throws InterruptedException
     */
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
