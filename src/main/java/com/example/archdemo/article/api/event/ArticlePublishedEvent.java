package com.example.archdemo.article.api.event;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class ArticlePublishedEvent {

    long articleID;

}
