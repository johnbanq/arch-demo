package com.example.archdemo.article.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Setter
@Getter
public class Article {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private String body;

    @ElementCollection
    private List<String> tagList;

    private Instant createdAt;

    private Instant updatedAt;

    private int authorID;

}
