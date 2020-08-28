package com.lixin.java8.gc;

import com.google.common.collect.Maps;

import java.util.HashMap;

public class TestGC {
    public static void main(String[] args) {
        HashMap<String , String> tm = Maps.newHashMap();
        System.gc();

    }
}
