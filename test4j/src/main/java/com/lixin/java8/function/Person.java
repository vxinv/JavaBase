package com.lixin.java8.function;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@Data
@NoArgsConstructor
public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayName(String yname,Retry retry){
        System.out.println("hello " + yname + " My name is" + name);
        retry.retry();
    }

    public void other(String name){
        System.out.println("hello "+ name + "test success");
    }

}
