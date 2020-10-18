package com.lixin.testweb.service;


import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl  implements  SendService{
    @Override
    public String sendEmailVerificationCode(String mailAddress) {
        return null;
    }

    @Override
    public boolean DeliveryNote(String mailAddress, String noteContent) {
        return false;
    }
}
