package com.lixin.java8.concurrencyBase_16.WaitThread_sync_wait_1532;


/**
 * 当前线程释放对象锁 放入条件等待队列阻塞
 * 等待时间到 或被其他线程调用notify/notifyAll 从条件队列中移除 重新获得竞争锁
 */
public class WaitThread extends Thread {

    private volatile boolean fire = false;

    @Override
    public void run() {
        try {
            synchronized (this){
                System.out.println("start");
                while (!fire){
                    /**
                     * 只能在sync 代码块中被调用 如果调用wait/notify 方法时，当前线程没有获取对象锁，
                     * 会抛出异常
                     */
                    this.wait();
                }
                System.out.println("end");
            }
        }catch (InterruptedException e){

        }
    }

    public synchronized void fire(){
        this.fire = true;
        this.notify();
    }

    public static void main(String[] args) throws InterruptedException {
        WaitThread waitThread = new WaitThread();
        waitThread.start();
        Thread.sleep(1000);
        System.out.println("fired");
        waitThread.fire();
    }

}
