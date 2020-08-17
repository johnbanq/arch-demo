package com.example.archdemo.notify.inbound.api;

import com.example.archdemo.notify.api.service.NotifyService;
import com.example.archdemo.notify.domain.service.Notifier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotifyServiceImpl implements NotifyService {

    private final Notifier notifier;

    @Override
    public void notifyUser(long userID, String content) {
        notifier.notifyUser(userID, content);
    }

    @Override
    public void notifyAll(String content) {
        notifier.notifyAll(content);
    }

}
