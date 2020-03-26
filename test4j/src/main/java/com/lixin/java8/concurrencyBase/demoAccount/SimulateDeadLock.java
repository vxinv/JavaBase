package com.lixin.java8.concurrencyBase.demoAccount;

import com.alibaba.fastjson.JSON;

import java.util.Random;

/**
 * 模拟死锁
 */
public class SimulateDeadLock {

    public static void main(String[] args) throws InterruptedException {
        final int accountNum = 11;
        final Account[] accounts = new Account[accountNum];
        final Random rnd = new Random();
        for (int i = 0; i < accountNum; i++) {
            accounts[i] = new Account(rnd.nextInt(111111));
        }
        int sum = 0;
        int sum2 = 0;
        for (Account account : accounts) {
            sum += account.getMoney();
        }
        System.out.println(JSON.toJSONString(accounts));
        int threadNum = 111;
        Thread[] threads = new Thread[threadNum];
        for (int i = 0; i < threadNum; i++) {
            threads[i] = new Thread(){
                @Override
                public void run() {
                    int loopNum = 111;
                    for (int i1 = 0; i1 < loopNum; i1++) {
                        int j = rnd.nextInt(accountNum);
                        int k = rnd.nextInt(accountNum);
                        int money = rnd.nextInt(11);
                        if (j!=k){
                            try {
                                AccountMgr.transfer2(accounts[j],accounts[k],money);
                            } catch (AccountMgr.NoEnoughMoneyException e) {}
                        }
                    }
                }
            };
            threads[i].start();
            threads[i].join();
        }

        for (Account account : accounts) {
            sum2 += account.getMoney();
        }
        System.out.println(sum);
        System.out.println(sum2);
        System.out.println(JSON.toJSONString(accounts));
    }
}
