package com.lixin.machDataSource;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

    Logger log = LoggerFactory.getLogger(this.getClass());

    public static final ThreadLocal<String> CONTEXTHOLDER = ThreadLocal.withInitial(DataSourceKey.master::getName);

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
