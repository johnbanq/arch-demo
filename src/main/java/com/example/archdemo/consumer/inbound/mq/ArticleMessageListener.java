package com.example.archdemo.consumer.inbound.mq;

import com.example.archdemo.article.api.event.ArticlePublishedEvent;
import com.example.archdemo.consumer.domain.service.NotifyArticleMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArticleMessageListener {

    private final NotifyArticleMessageService service;

    @EventListener
    public void onArticlePublished(ArticlePublishedEvent e) {
        service.onArticleCreated(e);
    }

}
