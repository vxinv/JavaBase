package com.lixin.java8.serialTest;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonDeserialize()
public class Cat implements Serializable {

    private static final long serialVersionUID = -5809782578272943999L;

    String name;
    int age;
    String color;


}
