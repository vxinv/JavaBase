package com.lixin.java8.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleJDKDynamicProxyDemo {

    static interface Iservice{
        public void sayHello();
    }

    static class  RealService implements Iservice{

        @Override
        public void sayHello() {
            System.out.println("hello lixin");
        }
    }

    static class SimpleInvocationHandler implements InvocationHandler{

        private Object realObject;

        public SimpleInvocationHandler(Object object) {
            this.realObject = object;
        }

        public SimpleInvocationHandler() {
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("entering "+method.getName());
            System.out.println(proxy.getClass().getName());
            Object result = method.invoke(realObject, args);
            System.out.println("leaving "+method.getName());
            return 1;
        }
    }

    public static void main(String[] args) {
        RealService realService = new RealService();
        Iservice proxyService = (Iservice) Proxy.newProxyInstance(Iservice.class.getClassLoader(), new Class<?>[]{Iservice.class},
                new SimpleInvocationHandler(realService));
        System.out.println(proxyService.getClass().getName());
        proxyService.sayHello();
    }
}
