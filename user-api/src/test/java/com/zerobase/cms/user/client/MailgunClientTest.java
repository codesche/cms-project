package com.zerobase.cms.user.client;

import static org.junit.jupiter.api.Assertions.*;

import com.zerobase.cms.user.client.mailgun.SendMailForm;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class MailgunClientTest {
    @Autowired
    private MailgunClient mailgunClient;

    @Test
    void sendMail() {
        mailgunClient.sendEmail(SendMailForm.builder()
            .to("xxx@naver.com")
            .from("dkasfd@gmail.com")
            .text("테스트입니다.")
            .subject("메일 테스트")
            .build());
    }
}