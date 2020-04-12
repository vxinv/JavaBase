package com.lixin.java8.concurrencyBase_16.demoComsumeProducer;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyBlockingQueue<String> queue = new MyBlockingQueue<>(10);

        new Producer(queue).start();
        new Consumer(queue).start();

        Thread.sleep(1000*600);
    }
}
