package com.lixin.testweb.service.impl;


import com.lixin.testweb.api.ResultCode;
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

import java.util.List;
import java.util.UUID;

@Service
public class SendServiceImpl implements SendService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ArticleMapper articleMapper;

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
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andNotifyGreaterThan((byte) 0);
        List<Article> articles = articleMapper.selectByExampleWithBLOBs(articleExample);

        StringBuilder builder = new StringBuilder();
        for (Article article : articles) {
            if (checkShouldAppend(article)) {
                builder.append("<p>").append(article.getTitle()).append("</p>").append(article.getContent());
            }
        }
        return Poster.send(mailAddress, "笔记复习提醒", builder.toString(), true);
    }

    /**
     * 检测当前的邮件是否应该加入
     */
    public boolean checkShouldAppend(Article article) {
        return true;
    }
}
