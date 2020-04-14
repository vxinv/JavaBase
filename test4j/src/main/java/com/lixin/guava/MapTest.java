package com.lixin.guava;


import com.google.common.collect.*;
import org.junit.Test;

import java.util.Set;

/**
 * guava 提供的多种map
 */
public class MapTest {

    /**
     * 键值对的双向映射
     */
    @Test
    public void testBiMap(){
        BiMap<String,String> biMap = HashBiMap.create();
        biMap.put("sina", "sina.com");
        biMap.put("qq","qq.com");
        biMap.put("al","ali.cn" );
        biMap.forcePut("al1", "ali.cn");
        biMap.forcePut("qq", "qq.cn");
        BiMap<String, String> inverse = biMap.inverse();
        for (String value : inverse.keySet()) {
            System.out.println(value);
        }
    }

    /**
     * 一个键映射多个值
     */
    @Test
    public void testMutiMap(){
        HashMultimap<String , Integer> multimap = HashMultimap.create();
        multimap.put("a", 1);
        multimap.put("a", 2);
        multimap.put("a",3);

        multimap.put("b",4);
        multimap.put("b",5);

        System.out.println("multimap get: " + multimap.get("a"));
        Set<Integer> aset = multimap.get("a");
        aset.add(7);
        System.out.println(aset);
        System.out.println("multimap size: " + multimap.size());
        System.out.println("multimap keyset size: " + multimap.keySet().size());
        System.out.println("multimap entries : " + multimap.entries());
        System.out.println("multimap keys : " + multimap.keys());
        System.out.println("multimap values : " + multimap.values());
        System.out.println("multimap asMap : " + multimap.asMap());

    }

    /**
     * table 表格操作数据
     */
    @Test
    public void testTable(){
        //记录学生在某门课上的成绩
        Table<String, String, Integer> table = HashBasedTable.create();
        table.put("jack", "java", 100);
        table.put("jack", "c", 90);
        table.put("mike", "java", 93);
        table.put("mike", "c", 100);
        Set<Table.Cell<String, String, Integer>> cells = table.cellSet();
        for (Table.Cell<String, String, Integer> cell : cells) {
            System.out.println(cell.getRowKey() + " " + cell.getColumnKey() + " " + cell.getValue());
        }
        System.out.println(table.row("jack"));
        System.out.println(table);
        System.out.println(table.rowKeySet());
        System.out.println(table.columnKeySet());
        System.out.println(table.values());
    }
}











