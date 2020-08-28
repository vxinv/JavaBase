package com.lixin.java8.LambdaTest;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;
import io.netty.util.concurrent.DefaultThreadFactory;
import junit.framework.TestCase;
import java.io.File;
import java.io.FilenameFilter;
import java.sql.Time;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试lambda表达式
 */
public class LambdaTest extends TestCase {



    public void testDemo1() throws InterruptedException {
        File f = new File("./../");
        File[] files = f.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.endsWith(".txt")){
                    return true;
                }
                return false;
            }
        });

        File[] files1 = f.listFiles((dir, name) -> name.endsWith(".txt"));
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        ThreadPoolExecutor testThreadPoolExecutor = new ThreadPoolExecutor(4, 10, 1000,
                TimeUnit.MINUTES, new LinkedBlockingDeque<>(100),
                new DefaultThreadFactory("TEST"),
                new ThreadPoolExecutor.CallerRunsPolicy());

        testThreadPoolExecutor.submit(()-> System.out.println("hello"));
        // 表达式可以访问定义在主体代码之外的变量 但对于局部变量 只能访问final 类型
        String msg = "hello world";
        /**
         * java 会将msg的值建立副本 表达式访问的是这个副本 
         */
        for (int i = 0; i < 10000; i++) {
            testThreadPoolExecutor.submit(()-> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+msg);

            });
        }
        Thread.sleep(Long.MAX_VALUE);

    }
    public void test_demo_2(){
        List<String> collect = Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(collect);

    }

    String msg = "hello world";
    int count = 1;
    public void test_3() throws InterruptedException {
        Runnable runnable = ()->{
            change(msg);
            incr(count);
        };
        new Thread(runnable).start();
        Thread.sleep(1000);
        System.out.println(msg);
        System.out.println(count);
    }

    void incr(Integer integer){
        count = integer +1;
    }

    void change(String str){
        System.out.println(str == msg);
        msg = "hello msg";
        str = "hello lixin";
        System.out.println(str == msg);
    }



    public void test_4() throws InterruptedException {
        Map<String,String> map = new HashMap<String,String>(2);

        map.put("hello","world");
        Runnable runnable = ()->{
            putTest(map);
        };
        new Thread(runnable).start();
        Thread.sleep(1000);
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }

    public void putTest(Map<String,String> tm){
        tm.put("hello1","lixin");
    }
}
