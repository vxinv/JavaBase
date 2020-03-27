package com.lixin.java8.concurrencyBase_16.ThreadInterruptedDemo;

public class WaittingThreadIsInterruptedDemo extends  Thread {


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
