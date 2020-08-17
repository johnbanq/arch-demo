package com.example.archdemo.article.infra.mq;

import com.example.archdemo.article.api.event.ArticlePublishedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArticleEventPublisher {

    private final ApplicationEventPublisher publisher;

    public void publishEvent(ArticlePublishedEvent event) {
        publisher.publishEvent(event);
    }

}
