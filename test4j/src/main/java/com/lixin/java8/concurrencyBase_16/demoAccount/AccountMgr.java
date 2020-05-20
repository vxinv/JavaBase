package com.lixin.java8.concurrencyBase_16.demoAccount;

/**
 * 转账的错误写法
 * 如果两个账户同时给对方转账
 * 都先获取了对方第一个锁
 * 会发生死锁
 */
public class AccountMgr {

    public static class NoEnoughMoneyException extends Exception{};
    private static volatile  int  i = 1;

    public static void transfer2(Account from,Account to, double money) throws NoEnoughMoneyException{
        boolean success = false;
        do {
            success = tryTransfer(from, to, money);
            if (!success){
                Thread.yield();
            }
        }while (!success);
    }

    public static void transfer(Account from,Account to, double money) throws NoEnoughMoneyException{
        from.lock();
        try {
            to.lock();
            try {
                if(from.getMoney() >= money){
                    from.reduce(money);
                    to.add(money);
                    i++;
                    System.out.println("转账成功"+i);
                }else {
                    throw new NoEnoughMoneyException();
                }
            }finally {
                to.unlock();
            }
        }finally {
            from.unlock();
        }
    }

    /**
     * 使用 tryLock 进行修改
     */
    public static boolean tryTransfer(Account from,Account to,double money) throws NoEnoughMoneyException{
        if (from.tryLock()){
            try {
                if (to.tryLock()){
                    try {
                        if (from.getMoney() >= money){
                            from.reduce(money);
                            to.add(money);
                            i++;
                            System.out.println("转账成功"+i);
                        }else {
                            throw  new NoEnoughMoneyException();
                        }
                        return true;

                    }finally {
                        to.unlock();
                    }
                }
            }finally {
                from.unlock();
            }
        }
        return false;
    }
}
