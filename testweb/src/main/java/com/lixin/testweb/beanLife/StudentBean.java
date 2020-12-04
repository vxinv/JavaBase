package com.lixin.testweb.beanLife;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class StudentBean implements BeanPostProcessor, BeanNameAware {


    private String name;

    public StudentBean() {
        System.out.println("========>构造函数 StudentBean");
    }


    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName" + name);
    }

    public void setName(String name) {
        System.out.println("设置对象属性setName()..");
        this.name = name;
    }

    @PostConstruct
    public void initStudent() {
        System.out.println("initStudent ");
    }

    @PreDestroy
    public void destoryStudent() {
        System.out.println("destoryStudent");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (beanName.equals("person")) {
            Person person = (Person) bean;
            if (person.objectMapper != null) {
                System.out.println("+++++++++++++++++++++++++++++++");
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(beanName);
        if (beanName.equals("person")) {
            Person person = (Person) bean;
            if (person.objectMapper != null) {
                System.out.println("+++++++++++++++++++++++++++++++");
            }
        }
        return bean;
    }
}
