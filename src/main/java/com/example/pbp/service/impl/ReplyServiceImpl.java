package com.example.pbp.service.impl;

import com.example.pbp.dao.ReplyDao;
import com.example.pbp.dto.request.ReplyRequest;
import com.example.pbp.dto.response.ReplyResponse;
import com.example.pbp.service.ReplyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyDao replyDao;

    @Override
    public ReplyResponse getRepliesResponse(int boardId) {
        ReplyResponse replyResponse = new ReplyResponse();
        replyResponse.setReplies(replyDao.selectRepliesByBoardId(boardId));
        return replyResponse;
    }

    @Override
    public void addReply(ReplyRequest replyRequest) {
        int insertReply = replyDao.insertReply(replyRequest);

        if(insertReply != 1) {
            log.error("댓글 작성 중 에러가 발생하였습니다.");
        }
    }

    @Override
    public void deleteReply(int replyId) {
        int deleteReply = replyDao.deleteReplyById(replyId);

        if(deleteReply != 1) {
            log.error("댓글 삭제 중 에러가 발생하였습니다.");
        }
    }
}
