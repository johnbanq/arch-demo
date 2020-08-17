package com.example.archdemo.consumer.domain.service;

import com.example.archdemo.article.api.event.ArticlePublishedEvent;
import com.example.archdemo.notify.api.service.NotifyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class NotifyArticleMessageService {

    private final NotifyService service;

    public void onArticleCreated(ArticlePublishedEvent e) {
        service.notifyAll(String.format("A new article published! ID=%d", e.getArticleID()));
    }

}
