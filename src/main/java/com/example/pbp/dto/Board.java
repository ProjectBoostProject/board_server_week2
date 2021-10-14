package com.example.pbp.dto;

import lombok.Data;

@Data
public class Board {
    private int id;
    private Integer menuId;
    private String boardName;
    private String title;
    private String writer;
    private String content;
    private String password;
    private String createDate;
    private String updateDate;
}
