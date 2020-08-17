package com.example.archdemo.notify.infra.service;

import org.springframework.stereotype.Component;

@Component
public class EmailSender {

    public void sendEmail(String address, String body) {
        //I duuno how to do this, and it doesnt matter
        //one benefit of this architecture is that I can talk about sending email without knowing how to impl it!
    }

}
