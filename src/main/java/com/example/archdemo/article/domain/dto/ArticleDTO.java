package com.example.archdemo.article.domain.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Instant;
import java.util.List;

/**
 * considering that the fields in create and update are so different from Article entity itself
 * we are using a separate DTO here
 */
@Value
public class ArticleDTO {

    String title;

    String description;

    String body;

    List<String> tagList;

}
