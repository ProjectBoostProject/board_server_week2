package com.example.pbp.service;

import com.example.pbp.dto.request.ReplyRequest;
import com.example.pbp.dto.response.ReplyResponse;
import org.springframework.transaction.annotation.Transactional;

public interface ReplyService {
    ReplyResponse getRepliesResponse(int boardId);
    @Transactional
    void addReply(ReplyRequest replyRequest);
    @Transactional
    void deleteReply(int replyId);
}
