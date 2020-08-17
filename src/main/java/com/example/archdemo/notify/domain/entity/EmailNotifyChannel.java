package com.example.archdemo.notify.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class EmailNotifyChannel {

    @Id
    private Long userID;

    private String email;

}
