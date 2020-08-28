package com.lixin.java8.function;


import org.junit.Test;

public class FunctionTest {

    @Test
    public void testRetry(){
        String testnName = "testOther";
        Person lixin = new Person("lixin", 18);
        lixin.sayName("zzz",()->{
            lixin.other(testnName);
            System.out.println(this);
        });
    }
}
