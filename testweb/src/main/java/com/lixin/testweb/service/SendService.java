package com.lixin.testweb.service;

import com.lixin.testweb.model.Article;

import java.util.List;

public interface SendService {

    /**
     * 发送邮箱验证码
     */
    String sendEmailVerificationCode(String mailAddress);

    /**
     * 推送笔记
     */
    boolean DeliveryNote(String mailAddress,String noteContent);
}
