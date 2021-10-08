package com.example.pbp.dto.request;

import lombok.Data;

@Data
public class ReplyRequest {
    private Integer boardId;
    private String writer;
    private String content;
    private String password;
}
