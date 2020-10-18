package com.lixin.java8.classInherit;

import java.lang.reflect.Field;

public class Person extends Animal {
    String name;
    int age;
    public Person(String name) {
        super(name);
        this.name = name;
    }

    public Person(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    @Override
    void say(){
        System.out.println("person say" + this.name);
    }

    public static void main(String[] args) {

        Person lixin = new Person("lixin",11);
        lixin.say();
        lixin.hi();

       /* Field[] declaredFields = lixin.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if (declaredField.getType() == int.class){
                System.out.println("hello");
            }else {
                System.out.println(declaredField.getType());
            }
        }*/
    }
}
