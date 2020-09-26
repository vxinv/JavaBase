package com.lixin.stock.controller;

import com.lixin.stock.entity.Person;
import com.lixin.stock.model.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestVueController {

    @GetMapping("/testVue")
    public CommonResult<Person> testVue(){
        Person person = new Person();
        person.setAge(11);
        person.setName("lll");
        return CommonResult.success(person, "success") ;
    }
}
