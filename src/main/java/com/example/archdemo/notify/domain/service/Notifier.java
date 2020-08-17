package com.example.archdemo.notify.domain.service;

import com.example.archdemo.notify.infra.db.NotifyChannelRepository;
import com.example.archdemo.notify.infra.service.EmailSender;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Notifier {

    private final NotifyChannelRepository repository;

    private final EmailSender sender;

    public void notifyUser(long userID, String content) {
        val channel = repository.findById(userID).orElseThrow();
        sender.sendEmail(channel.getEmail(), content);
    }

    public void notifyAll(String content) {
        repository.findAll().forEach(c->sender.sendEmail(c.getEmail(), content));
    }

}
