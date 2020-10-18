package com.lixin.testweb.service.impl;

import com.goodluck.commom.api.ResultCode;
import com.goodluck.commom.exception.ApiException;
import com.lixin.testweb.dao.UserMapper;
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

    /**
     *
     * @return 0 -1 1 未知错误 用户名占用 成功
     */
    @Override
    public int registerUser(User user) {
        UserExample ue = new UserExample();
        UserExample.Criteria criteria = ue.createCriteria();
        criteria.andUserNameEqualTo(user.getUserName());
        List<User> users = userMapper.selectByExample(ue);
        if (users.size()!=0){
            return -1;
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
    public boolean getMailCode(User user) {
        if (registerUser(user) != 1){
            throw  new ApiException(ResultCode.DuplicateUserName);
        }

        return false;
    }
}
