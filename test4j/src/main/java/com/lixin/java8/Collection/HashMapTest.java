package com.lixin.java8.Collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {


    @Test
    public void testHashMapNull(){
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put(null,null);
        stringStringHashMap.put("hello",null);
        stringStringHashMap.put(null,"world");
        Iterator<String> iterator = stringStringHashMap.keySet().iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("key是"+next);
            System.out.println("value是"+stringStringHashMap.get(next));
        }
    }
}
