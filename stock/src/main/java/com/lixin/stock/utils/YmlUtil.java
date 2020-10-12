package com.lixin.stock.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class YmlUtil {

    //private final static String filename = "config.yml";

    private static final Map ymls = new LinkedHashMap();

    /**
     * string:当前线程需要查询的文件名
     */
    private static final ThreadLocal<String> nowFileName = new ThreadLocal<>();

    /**
     * 加载配置文件
     */
    private static void loadYml(String filename) {
        String allfilename = filename+".yml";
        InputStream resourceAsStream = YmlUtil.class.getResourceAsStream("/" + allfilename);
        ymls.put(filename,new Yaml().loadAs(resourceAsStream, LinkedHashMap.class));
    }

    private static Object getValue(String key,String name) {
        // 首先将key进行拆分
        Map file = (Map) ymls.get(name);
        String[] keys = key.split("[.]");
        for (int i = 0; i < keys.length; i++) {
            Object value = file.get(keys[i]);
            if (i < keys.length - 1) {
                file = (Map) value;
            } else if (value != null) {
                return value;
            }
        }
        return null;
    }

    public static Object get(String key,String name) {
        loadYml(name);
        return getValue(key,name);
    }


}
