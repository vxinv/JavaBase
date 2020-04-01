package com.lixin.machDataSource;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

    Logger log = LoggerFactory.getLogger(this.getClass());

    /*
     * ThreadLocal,叫线程本地变量或线程本地存储。
     * ThreadLocal为变量在每个线程中都创建了一个副本，那么每个线程可以访问自己内部的副本变量。
     * 这里使用它的子类InheritableThreadLocal用来保证父子线程都能拿到值。
     */

    public static final ThreadLocal<String> CONTEXTHOLDER = InheritableThreadLocal.withInitial(DataSourceKey.master::getName);

    public static List<Object> dataSourceKeys  = new ArrayList<>();

    public static void setDataSourceKey(String key){
        CONTEXTHOLDER.set(key);
    }

    public static void useMasterDataSource(){
        CONTEXTHOLDER.set(DataSourceKey.master.name());
    }

    public static void useDataSource(){
        CONTEXTHOLDER.set(DataSourceKey.slave.name());
    }

    public static void clearDataSourcekey(){
        CONTEXTHOLDER.remove();
    }

    public static String getDataSourcekey(){
        return CONTEXTHOLDER.get();
    }


}
