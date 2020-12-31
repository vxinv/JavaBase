package com.lixin.testweb.beanLife;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

/*@Component("person")*/
public class Person {
    public final ObjectMapper objectMapper;


    @Autowired
    public Person(ObjectMapper objectMapper) {
        System.out.println("person的属性注入");
        this.objectMapper = objectMapper;
    }
}
