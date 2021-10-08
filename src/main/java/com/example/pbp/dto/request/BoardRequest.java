package com.example.pbp.dto.request;

import lombok.Data;

@Data
public class BoardRequest {
    private String title;
    private String writer;
    private String content;
    private String password;
}
