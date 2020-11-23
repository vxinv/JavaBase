package com.lixin.testweb.service;

import com.lixin.testweb.dto.RegisterDto;
import com.lixin.testweb.model.User;

import java.util.List;

public interface UserService {

    /**
     * 用户注册添加
     */
    int registerUser(User user);
    /**
     * 检测用户邮箱正确
     */
    boolean checkCode(String code, String userName);

    /**
     * 获取所有的用户
     */
    List<User> getAllUser();

    /**
     * 用户获取邮箱验证码
     */
    boolean registerAll(RegisterDto registerDto);

    /**
     * 用户登录
     */
    User login(User user);
}

