package com.lixin.guava;

import com.google.common.collect.Sets;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.HashSet;

public class SetsTest extends TestCase {

    final HashSet<Integer> sets = null;
    final HashSet<Integer> sets2 = null;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        System.out.println("start");
        sets.addAll(Arrays.asList(1, 2, 3, 6, 9));
        sets2.addAll(Arrays.asList(1, 5, 7, 6, 9));
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        System.out.println("end");
    }

    // 使用guava
    public void testSets() {
        HashSet<Integer> sets = Sets.newHashSet(5);
        sets.addAll(Arrays.asList(1, 2, 3, 6, 9));
        HashSet<Integer> sets2 = Sets.newHashSet(5);
        sets2.addAll(Arrays.asList(1, 5, 7, 6, 9));

        // 交集
        System.out.println("交集为：");
        Sets.SetView<Integer> intersection = Sets.intersection(sets, sets2);
        for (Integer temp : intersection) {
            System.out.println(temp);
        }
        // 差集
        System.out.println("差集为：");
        Sets.SetView<Integer> diff = Sets.difference(sets, sets2);
        for (Integer temp : diff) {
            System.out.println(temp);
        }
        // 并集
        System.out.println("并集为：");
        Sets.SetView<Integer> union = Sets.union(sets, sets2);
        for (Integer temp : union) {
            System.out.println(temp);
        }

    }

    // 使用java8
    public void testWithJava8() {
        /*HashSet<Integer> sets = Sets.newHashSet(5);
        sets.addAll(Arrays.asList(1, 2, 3, 6, 9));
        final HashSet<Integer> sets2 = Sets.newHashSet(5);
        sets2.addAll(Arrays.asList(1, 5, 7, 6, 9));

        List<String> collect1 = sets.stream().filter(num -> set2.contains(num))
                .collect(Collectors.toList());
        System.out.println("交集");
        collect1.stream().forEach(System.out::println);

        //差集 list1-list2
        List<String> collect2 = list1.stream().filter(num -> !list2.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list1-list2");
        collect2.stream().forEach(System.out::println);

        //差集list2-list1
        List<String> collect3 = list2.stream().filter(num -> !list1.contains(num))
                .collect(Collectors.toList());
        System.out.println("差集list2-list1");
        collect3.stream().forEach(System.out::println);

        //并集  不去重
        list1.addAll(list2);
        System.out.println("并集  不去重");
        list1.stream().forEach(System.out::println);

        //并集  去重
        List<String> collect4 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("并集  去重");
        collect4.stream().forEach(System.out::println);*/
    }


}
