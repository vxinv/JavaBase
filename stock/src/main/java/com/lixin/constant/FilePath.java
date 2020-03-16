package com.lixin.constant;

/**
 * 存放的是python文件的路径
 */
public class FilePath {

    public static String prefix ="py "+ System.getProperty("user.dir");
    public static String baseUrl = prefix + "\\src\\main\\java\\com.lixin.pysrcfile\\";
    public static String test_py= baseUrl+"javatest.py";
    public static String sell = baseUrl+"sell.py";
    public static String checkorder = baseUrl+"check_order.py";

}
