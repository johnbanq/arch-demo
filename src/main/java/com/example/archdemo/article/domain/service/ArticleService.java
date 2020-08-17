package com.example.archdemo.article.domain.service;

import com.example.archdemo.article.api.event.ArticlePublishedEvent;
import com.example.archdemo.article.domain.dto.ArticleDTO;
import com.example.archdemo.article.domain.entity.Article;
import com.example.archdemo.article.infra.db.ArticleRepository;
import com.example.archdemo.article.infra.mq.ArticleEventPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class ArticleService {

    private final ArticleEventPublisher publisher;

    private final ArticleRepository repository;

    /**
     * note: The AuthUser requires Spring Security, I am feeling lazy in setting it up :/
     * so I commented out all related code so the app boots
     */
    public Article createArticle(ArticleDTO dto/*, AuthUser user*/) {
        Article article = new Article();
        article.setTitle(dto.getTitle());
        article.setDescription(dto.getDescription());
        article.setBody(dto.getBody());
        article.setTagList(dto.getTagList());
        //article.setAuthorID(user.getUID());
        val created = Instant.now();
        article.setCreatedAt(created);
        article.setUpdatedAt(created);

        repository.save(article);
        publisher.publishEvent(new ArticlePublishedEvent(article.getId()));

        return article;
    }

    public List<Article> getArticles(Pageable page) {
        return repository.findAll(page).getContent();
    }

    public Article updateArticles(Long articleID, ArticleDTO dto) {
        Article article = repository.findOneById(articleID);
        article.setTitle(dto.getTitle());
        article.setDescription(dto.getDescription());
        article.setBody(dto.getBody());
        article.setTagList(dto.getTagList());
        val created = Instant.now();
        article.setUpdatedAt(created);

        repository.save(article);

        return article;
    }

    public void deleteArticle(Long articleID) {
        repository.deleteById(articleID);
    }

}
