package com.lixin.testweb.service.impl;

import com.lixin.testweb.api.ResultCode;
import com.lixin.testweb.dao.UserMapper;
import com.lixin.testweb.dto.RegisterDto;
import com.lixin.testweb.exception.ApiException;
import com.lixin.testweb.model.User;
import com.lixin.testweb.model.UserExample;
import com.lixin.testweb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    SendServiceImpl sendService;

    /**
     * @return 0 -1 1 未知错误 用户名占用 成功
     */
    @Override
    public int registerUser(User user) {
        UserExample ue = new UserExample();
        UserExample.Criteria criteria = ue.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());

        List<User> users = userMapper.selectByExample(ue);
        if (users.size() != 0) {
            throw new ApiException(ResultCode.DuplicateUserName);
        }
        return userMapper.insertSelective(user);
    }

    @Override
    public boolean checkCode(String code, String userName) {
        UserExample ue = new UserExample();
        UserExample.Criteria criteria = ue.createCriteria();
        criteria.andUserNameEqualTo(userName);
        List<User> users = userMapper.selectByExample(ue);
        return users.size() == 1 && users.get(0).getCode().equals(code);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.selectByExample(null);
    }

    @Override
    public boolean registerAll(RegisterDto registerDto) {


        boolean b = checkCode(registerDto.getCode(), registerDto.getUsername());
        if (!b) {
            throw new ApiException(ResultCode.TheEmailVerificationCodeIsIncorrect);
        }

        User user = new User();
        user.setMail(registerDto.getEmail());
        user.setCode(registerDto.getCode());
        user.setPassWord(registerDto.getPassword());

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(registerDto.getUsername());

        int i = userMapper.updateByExampleSelective(user, userExample);
        if (i != 1) {
            throw new ApiException(ResultCode.FAILED);
        }
        return true;
    }

    @Override
    public User login(User user) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUserNameEqualTo(user.getUserName())
                .andPassWordEqualTo(user.getPassWord());

        List<User> users = userMapper.selectByExample(userExample);
        if (users.size() != 1) {
            throw new ApiException(ResultCode.usernameOrPasswordIsIncorrect);
        }
        return users.get(0);
    }
}
