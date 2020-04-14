package com.lixin.java8.MapSet10;


import junit.framework.TestCase;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * 键值对之间 按键有序
 */
public class TreeMapTest extends TestCase {

    /**
     * 测试排序的map
     */
    public void test_sort_map(){
        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            /**
             * 大于0 往右 小于0 往左 等于0 覆盖
             */
            public int compare(Integer o1, Integer o2) {
               return o1-o2;
            }
        });

        treeMap.put(3,"world");
        treeMap.put(1,"lixin");
        treeMap.put(2,"hello");
        treeMap.put(5,"java");
        // 遍历 都是从左往右
        for (Map.Entry<Integer, String> integerStringEntry : treeMap.entrySet()) {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
        }

        Integer integer = treeMap.ceilingKey(4);
        System.out.println(integer);
        System.out.println(treeMap.floorKey(4));
        String remove = treeMap.remove(5);
        System.out.println(remove);


    }
}
