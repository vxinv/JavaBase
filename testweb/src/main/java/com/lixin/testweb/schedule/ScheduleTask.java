package com.lixin.testweb.schedule;

import com.lixin.testweb.dao.UserMapper;
import com.lixin.testweb.model.User;
import com.lixin.testweb.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 定时发送邮件
 */

@Component
@EnableScheduling
public class ScheduleTask {

    @Autowired
    UserMapper userMapper;
    @Autowired
    SendService sendService;

    /**
     * 早上发送邮件
     */
    @Scheduled(cron = "0 0 9 * * ?")
    public void send9() {
        sendEmail();
    }

    @Scheduled(cron = "0 0 12 * * ?")
    public void send12() {
        sendEmail();
    }

    @Scheduled(cron = "0 0 18 * * ?")
    public void send18() {
        sendEmail();
    }


    public void sendEmail() {
        // 获取 所有的用户
        List<User> users = userMapper.selectByExample(null);
        for (User user : users) {
            sendService.DeliveryNote(user.getMail(), "", user.getUserName());
        }

    }


}
