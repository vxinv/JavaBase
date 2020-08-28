package com.lixin.java8.MapSet10;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest extends TestCase {

    @Test
    public void  testIterRm(){
        HashMap<String, String> stringStringHashMap = new HashMap<>(10);
        // init
        for (int i = 0; i < 10; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                stringStringHashMap.putIfAbsent(String.valueOf(i),String.valueOf(i1));
            }
        }
        // iter删除
        stringStringHashMap.entrySet().removeIf(stringStringEntry -> Integer.parseInt(stringStringEntry.getKey()) % 2 == 1);
        for (Map.Entry<String, String> stringStringEntry : stringStringHashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey());
        }
    }

    @Test
    public void testNull(){
        HashMap<String, Boolean>  ssm = new HashMap<>();
         if (ssm.get("null")){
             System.out.println("");
         }
    }
}
