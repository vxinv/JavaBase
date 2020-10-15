package com.lixin.testweb.controller;

import com.lixin.testweb.dto.Money;
import com.lixin.testweb.dto.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMvc {

    @PostMapping("/TestGeneric")
    public CommomResult<String> TestGeneric(@RequestBody  Person<Money> person){
        person.getOther().cost(3);
        return null;
    }

}

