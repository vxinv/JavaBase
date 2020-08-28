package com.lixin.java8.LambdaTest;

import io.netty.util.concurrent.DefaultThreadFactory;

public class  ThreadNameFactory  extends DefaultThreadFactory {

    public ThreadNameFactory(String poolName, boolean daemon, int priority) {
        super(poolName);
    }
}
