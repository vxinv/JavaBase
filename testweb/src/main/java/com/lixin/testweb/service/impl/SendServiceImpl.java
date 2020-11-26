package com.lixin.testweb.service.impl;


import com.github.pagehelper.PageHelper;
import com.lixin.testweb.api.ResultCode;
import com.lixin.testweb.common.CommonUtils;
import com.lixin.testweb.dao.ArticleMapper;
import com.lixin.testweb.dao.UserMapper;
import com.lixin.testweb.exception.ApiException;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.model.ArticleExample;
import com.lixin.testweb.model.User;
import com.lixin.testweb.model.UserExample;
import com.lixin.testweb.service.SendService;
import com.lixin.testweb.utils.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.UUID;

@Service
public class SendServiceImpl implements SendService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ArticleMapper articleMapper;
    long[] unitDays = {1, 2, 4, 7, 15, 30, 60};

    @Override
    public String sendEmailVerificationCode(String mailAddress, String userName) {
        String code = UUID.randomUUID().toString().substring(0, 5);
        if (!Poster.send(mailAddress, "验证码邮件", code, false)) {
            throw new ApiException(ResultCode.MailAddressIncorrect);
        }
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        User user = new User();
        user.setCode(code);
        int i = userMapper.updateByExampleSelective(user, userExample);
        return code;
    }

    /**
     *
     * @param mailAddress   邮件地址
     * @param noteContent   邮件内容
     * @param userName      用户名
     * @return
     */
    @Override
    public boolean DeliveryNote(String mailAddress, String noteContent, String userName) {
        int pageNo = 1;

        PageHelper.startPage(pageNo, 20);
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        // 0 全部类型 1 不推送 2 每两天推送 3 每周三推送 4 每月15 推送 5 艾宾浩斯推送 6 当天推送
        criteria.andNotifyGreaterThan((byte) 1);
        List<Article> articles = articleMapper.selectByExampleWithBLOBs(articleExample);

        StringBuilder builder = new StringBuilder();
        for (Article article : articles) {

            if (checkShouldAppend(article)) {
                builder.append("<h1 style= \"background-color: #ff0000 ; color:#ffffff\" ; align=\"center\" >").append(article.getTitle()).append("</h1>").append(article.getContent());
            }
        }
        return Poster.send(mailAddress, LocalDate.now().format(CommonUtils.df) + "日笔记复习提醒", builder.toString(), true);

    }

    /**
     * 检测当前的邮件是否应该加入
     */
    public boolean checkShouldAppend(Article article) {
        LocalDate publishDate = article.getPublishTime().toLocalDate();
        LocalDate now = LocalDate.now();
        Byte notify = article.getNotify();

        if (notify == 2) {
            return publishDate.until(now, ChronoUnit.DAYS) % 2 == 0;
        }

        if (notify == 3) {
            return now.getDayOfWeek() == DayOfWeek.WEDNESDAY;
        }

        if (notify == 4) {
            return now.getDayOfMonth() == 15;
        }

        if (notify == 5) {
            long until = publishDate.until(now, ChronoUnit.DAYS);
            for (long unitDay : unitDays) {
                if (until == unitDay) {
                    return true;
                }
            }
            return false;
        }

        if (notify == 6) {
            return publishDate.equals(now);
        }

        return notify == 7;
    }
}
