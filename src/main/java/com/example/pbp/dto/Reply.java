package com.example.pbp.dto;

import lombok.Data;

@Data
public class Reply {
    private int id;
    private int boardId;
    private String writer;
    private String content;
    private String password;
    private String createDate;
    private String updateDate;
}
