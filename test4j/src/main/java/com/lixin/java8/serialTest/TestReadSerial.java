package com.lixin.java8.serialTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestReadSerial {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("./test4j/src/main/resources/test.tmp")));
        Society society = (Society) ois.readObject();
        System.out.println(society.persons.get(12819).toString());
    }
}
