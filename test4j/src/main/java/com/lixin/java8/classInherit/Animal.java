package com.lixin.java8.classInherit;


public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void say(){
        System.out.println("animal say"+this.name);
    }

    void hi(){
        System.out.println(this.getClass().getName());
        System.out.println(super.getClass().getName());
    }
}
