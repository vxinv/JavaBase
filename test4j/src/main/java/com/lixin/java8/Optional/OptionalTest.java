package com.lixin.java8.Optional;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    /**
     * orElse 如果创建的Optional中有值存在，则返回此值，否则返回一个默认值
     */
    @Test
    public void testOfNullable() {
        String s = Optional.<String>ofNullable(null).orElseGet(() -> {
            return  "hello";
        });
        System.out.println(s);
    }

    /**
     * map 如果创建的Optional中的值存在，对该值执行提供的Function函数调用
     */
    @Test
    public void testMapOptional() {
        Optional<String> string = Optional.ofNullable("1");
        String s1 = string.map((s) -> {
            return "test_map";
        }).orElse("test");

        System.out.println(s1);
    }

    /**
     * filter 如果optional 中的值满足filter 中的条件 则返回包含该值 的Optional 对象
     */

    @Test
    public void testFilterOptional() {
        Optional<String> string = Optional.ofNullable(null);
        String s1 = string.filter((s) -> s.equals(null)).orElse("");
        string.filter((s) -> s.equals("")).orElse("");
        System.out.println(s1);
    }


}
