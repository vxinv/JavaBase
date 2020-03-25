package com.lixin.java8.concurrencyBase.demoComsumeProducer;

public class Consumer extends Thread {
    MyBlockingQueue<String> queue;

    public Consumer(MyBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true){

                String task = queue.take();
                System.out.println("handle task" + task);
                Thread.sleep(((int) (Math.random() * 10)));

            }
        }catch (InterruptedException e){

        }
    }
}
