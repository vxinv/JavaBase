package com.lixin.testweb.service.impl;


import cn.hutool.core.util.StrUtil;
import com.goodluck.commom.api.ResultCode;
import com.goodluck.commom.exception.ApiException;
import com.lixin.testweb.dao.ArticleMapper;
import com.lixin.testweb.dao.UserMapper;
import com.lixin.testweb.model.Article;
import com.lixin.testweb.model.ArticleExample;
import com.lixin.testweb.model.User;
import com.lixin.testweb.model.UserExample;
import com.lixin.testweb.service.SendService;
import com.lixin.testweb.utils.Poster;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class




SendServiceImpl  implements SendService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    ArticleMapper articleMapper;

    @Override
    public String sendEmailVerificationCode(String mailAddress,String userName) {
        String code = UUID.randomUUID().toString().substring(0, 5);
        if (!Poster.send(mailAddress,"验证码邮件",code ,false)){
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

    @Override
    public boolean DeliveryNote(String mailAddress, String noteContent,String userName) {
        ArticleExample articleExample = new ArticleExample();
        ArticleExample.Criteria criteria = articleExample.createCriteria();
        criteria.andUserNameEqualTo(userName);
        criteria.andNotifyGreaterThan((byte) 0);
        List<Article> articles = articleMapper.selectByExample(articleExample);

        StringBuilder builder = new StringBuilder();
        for (Article article : articles) {
            if (checkShouldAppend(article)){
               builder.append("<p>").append(article.getTitle()).append("</p>").append(article.getContent());
            }
        }
        return Poster.send(mailAddress, "笔记复习提醒", builder.toString(), true);
    }

    /**
     * 检测当前的邮件是否应该加入
     */
    public boolean checkShouldAppend(Article article){
        return true;
    }
}
