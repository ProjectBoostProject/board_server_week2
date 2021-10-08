package com.example.pbp.dto.response;

import com.example.pbp.dto.Reply;
import lombok.Data;

import java.util.List;

@Data
public class ReplyResponse {
    private List<Reply> replies;
}
