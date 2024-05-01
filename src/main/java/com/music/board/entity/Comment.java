package com.music.board.entity;

import jakarta.persistence.*;

@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    //TODO : 연관관계 맵핑하기 board ID 로


    private String comment;
}
