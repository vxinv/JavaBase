package com.lixin.testweb.schedule;

import com.lixin.testweb.dao.UserMapper;
import com.lixin.testweb.model.User;
import com.lixin.testweb.service.SendService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScheduleTaskTest {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SendService sendService;

    @Test
    public void testSendEmail(){
        // 获取 所有的用户
        List<User> users = userMapper.selectByExample(null);

        for (User user : users) {
            sendService.DeliveryNote(user.getMail(),"",user.getUserName());
        }
    }

}