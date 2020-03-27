package com.lixin.java8.concurrencyCollection_17;

import java.util.Collections;
import java.util.Map;

public class EnhancedMapDemo <K,V> {
    Map<K,V> map;

    public EnhancedMapDemo(Map<K, V> map) {
        // 该方法通过给所有的容器方法添加synchronized 来实现
        this.map = Collections.synchronizedMap(map);
    }

    public V putIfAbsent(K key,V value){
        synchronized (map){
            V old = map.get(key);
            if (old != null){
                return old;
            }
            return map.put(key,value);
        }
    }

    public V put(K key,V value){
        return  map.put(key,value);
    }



}
