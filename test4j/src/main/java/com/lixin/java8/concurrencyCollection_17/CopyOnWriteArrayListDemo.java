package com.lixin.java8.concurrencyCollection_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    /**
     *适用于 读比写频繁许多
     *数据量不大
     */
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> strings = new CopyOnWriteArrayList<>();
        ArrayList<String>  list = new ArrayList<>();
        List<String> clist = Collections.synchronizedList(list);

    }
}
