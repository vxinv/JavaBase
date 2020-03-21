package com.lixin.java8;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;
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
}
