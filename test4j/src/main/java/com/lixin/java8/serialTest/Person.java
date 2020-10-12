package com.lixin.java8.serialTest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    String name = "xiaoming";
    String unKown;
    int age;
    int unHaveInt = 0;
    String unHaveString = "hello";
    List<Cat> cats;
}
