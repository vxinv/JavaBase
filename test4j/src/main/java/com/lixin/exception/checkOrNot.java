package com.lixin.exception;

import javax.validation.constraints.Null;

public class checkOrNot {

    public static void main(String[] args) {
        try {
            test01();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("uncheck");
        test3();
        test02();


    }

    public  static  void test01() throws Exception {
        throw new Exception();
    }

    public static void test02(){
        throw new RuntimeException();
    }
    public static void test3(){
        throw  new RuntimeException();
    }
}
