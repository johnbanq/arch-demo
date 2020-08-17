package com.example.archdemo.article.infra.db;

import com.example.archdemo.article.domain.entity.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ArticleRepository extends PagingAndSortingRepository<Article, Long> {

    Article findOneById(Long id);

}
