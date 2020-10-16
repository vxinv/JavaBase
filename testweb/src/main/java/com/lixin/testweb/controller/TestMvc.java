package com.lixin.testweb.controller;

import com.goodluck.commom.api.CommonResult;
import com.lixin.testweb.dto.Money;
import com.lixin.testweb.dto.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMvc {

    @PostMapping("/TestGeneric")
    public CommonResult<String> TestGeneric(@RequestBody Person<Money> person) {
        person.getOther().cost(3);
        return null;
    }

}

