package com.lixin.java8.serialTest;


import com.google.common.collect.Lists;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class TestSerial {
    public static void main(String[] args) throws Exception {
        System.out.println(System.currentTimeMillis());
        Society society = new Society();
        society.setName("动物社会");
        for (int i = 30000; i > 0; i--) {
            Person person = new Person();
            person.setAge(i);
            person.setName("lixin");
            ArrayList<Cat> cats = new ArrayList<>();
            Cat cat1 = new Cat("cat1", 3, "black");
            Cat cat2 = new Cat("cat2", 3, "red");
            Cat cat3 = new Cat("cat3", 3, "white");
            cats.add(cat1);
            cats.add(cat2);
            cats.add(cat3);
            person.setCats(cats);
            society.getPersons().add(person);
        }

        System.out.println(System.currentTimeMillis());
        FileOutputStream fileOutputStream = new FileOutputStream(new File("./test4j/src/main/resources/test.tmp"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
        society.mywriteMethod(bufferedOutputStream, society);
        System.out.println(System.currentTimeMillis());

        FileInputStream fileInputStream = new FileInputStream(new File("./test4j/src/main/resources/test.tmp"));
        Society society1 = society.myreadMethod(fileInputStream);
        society1.setPersons(Lists.reverse(society1.getPersons()));
        System.out.println(society1.getPersons().get(1002));
    }


}
