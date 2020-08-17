package com.example.archdemo.notify.domain.service;

import com.example.archdemo.notify.domain.entity.EmailNotifyChannel;
import com.example.archdemo.notify.infra.db.NotifyChannelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotifyChannelService {

    private final NotifyChannelRepository repository;

    public void putChannel(EmailNotifyChannel channel) {
        repository.save(channel);
    }

}
