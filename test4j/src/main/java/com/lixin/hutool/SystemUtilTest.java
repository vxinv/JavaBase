package com.lixin.hutool;


import cn.hutool.system.SystemUtil;
import org.junit.Test;

public class SystemUtilTest {

    @Test
    public void testSystem(){
        System.out.println(SystemUtil.getCurrentPID());
        System.out.println(SystemUtil.getRuntimeInfo());
        System.out.println(SystemUtil.getOsInfo());
        System.out.println(SystemUtil.getJvmInfo());
        System.out.println(SystemUtil.getHostInfo());
        System.out.println(SystemUtil.getJavaRuntimeInfo());
    }
}
