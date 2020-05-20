package com.lixin.java8.LambdaTest;

import junit.framework.TestCase;
import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试lambda表达式
 */
public class LambdaTest extends TestCase {

    public void testDemo1(){
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
        executorService.submit(()-> System.out.println("hello"));
        // 表达式可以访问定义在主体代码之外的变量 但对于局部变量 只能访问final 类型
        String msg = "hello world";
        //msg = "nihao";
        /**
         * java 会将msg的值建立副本 表达式访问的是这个副本 
         */
        executorService.submit(()-> System.out.println(msg));

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
        System.out.println(map.get("hello"));
    }

    public void putTest(Map<String,String> tm){
        tm.put("hello","lixin");
    }
}
