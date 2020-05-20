package com.lixin.java8.stream;

import com.google.common.collect.Lists;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * java 8 流测试
 */
public class StreamTest {

    /**
     * test Stream
     */

    @Test
    public  void testFilter(){

        List<String> array = Lists.newArrayList("1", "2", "3", "4", "5", "6");

        List<Integer> a = array.stream().map(s -> Integer.parseInt(s))
                .filter(integer -> integer >= 4)
                .collect(Collectors.toList());

        System.out.println(a);
    }


    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        System.out.println(l);
        System.out.println(UUID.randomUUID().toString());
        ArrayList<String> list = new ArrayList<>(1000);
        for (int i = 0; i < 100000000; i++) {
            if (i==21897889){
                list.add("lixin");
            }
            list.add(UUID.randomUUID().toString());
        }
        long l1 = System.currentTimeMillis();
        System.out.println("创建花费时间"+(l1-l));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("lixin")){
                long l2 = System.currentTimeMillis();
                System.out.println(i);
                System.out.println("寻找花费时间"+(l2-l1));
            }
        }

    }
}
