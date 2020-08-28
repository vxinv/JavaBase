package com.lixin.testweb.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person<T> {
    String name = "xiaoming";
    String unKown;
    int age;
    int unHaveInt = 0;
    String unHaveString = "hello";
    List<Cat> cats;
    T other;
}
