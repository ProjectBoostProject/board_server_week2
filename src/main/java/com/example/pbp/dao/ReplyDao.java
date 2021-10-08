package com.example.pbp.dao;

import com.example.pbp.dto.Reply;
import com.example.pbp.dto.request.ReplyRequest;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReplyDao {
    List<Reply> selectRepliesByBoardId(int boardId);
    int insertReply(ReplyRequest replyRequest);
    int deleteReplyById(int replyId);
}
