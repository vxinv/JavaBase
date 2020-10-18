package com.lixin.testweb.utils;

import cn.hutool.extra.mail.MailAccount;
import cn.hutool.extra.mail.MailUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;

/*根据Hutool 封装的邮件通知类*/
public class Poster {

    private final static Log log = LogFactory.get();

    private static MailAccount account;

    private static void initAccount() {
        account = new MailAccount();
        account.setHost("smtp.qq.com");
        account.setPort(25);
        account.setAuth(true);
        account.setFrom("lixin.ok@qq.com");
        account.setUser("lixin.ok@qq.com");
        account.setPass("scbneoddacylihjd");
    }

    public static void send(String subject, String content) {
        if (account == null) {
            initAccount();
        }
        try {
            MailUtil.send(account,"lixin.ok@qq.com", subject, content, false);
        } catch (Exception e) {
            log.error("无法通过邮件通知您，请检查config.yml配置文件，确保邮件相关配置正确！error：" + e.getMessage());
        }
    }


    public static void sendTest() {
        Poster.send("邮件配置测试", "测试邮件是否能发送成功！收到邮件证明邮件信息配置正确！");
    }

    public static void main(String[] args) {
        sendTest();
    }
}
