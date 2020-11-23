package com.lixin.testweb.controller;

import com.lixin.testweb.api.CommonResult;
import com.lixin.testweb.dto.Money;
import com.lixin.testweb.dto.Person;
import com.lixin.testweb.dto.RegisterDto;
import com.lixin.testweb.model.User;
import com.lixin.testweb.service.SendService;
import com.lixin.testweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    SendService sendService;

    @PostMapping("/TestGeneric")
    public CommonResult<String> TestGeneric(@RequestBody Person<Money> person) {
        person.getOther().cost(3);
        return null;
    }

    /**
     * 注册 用户名 密码 邮箱
     * 不验证验证码
     * @param register
     * @return
     */
    @PostMapping("/userRegister")
    public CommonResult<Integer> userRegister(@RequestBody RegisterDto register){
        User user = new User();

        user.setUserName(register.getUsername());
        user.setPassWord(register.getPassword());
        user.setMail(register.getEmail());

        int i = userService.registerUser(user);
        return CommonResult.success(i, "success");
    }

    /**
     * 获取验证码
     * @param registerDto
     * @return
     */
    @PostMapping("/getUserCode")
    public CommonResult<String> getUserCode(@RequestBody RegisterDto registerDto){
        sendService.sendEmailVerificationCode(registerDto.getEmail(),registerDto.getUsername());
        return CommonResult.success(null);
    }


    /**
     * 验证用户注册的邮箱
     * 整体注册
     * @param registerDto
     * @return
     */
    @PostMapping("/allRegister")
    public CommonResult<String> allRegister(@RequestBody RegisterDto registerDto) {
        userService.registerAll(registerDto);
        return CommonResult.success(null);
    }


    /**
     * 用户登录 返回登录信息
     *
     * @return
     */
    @PostMapping("/users/login")
    public CommonResult<User> login(@RequestBody User user) {

        User login = userService.login(user);
        return CommonResult.success(login);
    }

}

