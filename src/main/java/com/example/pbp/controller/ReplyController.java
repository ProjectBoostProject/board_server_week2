package com.example.pbp.controller;

import com.example.pbp.dto.request.ReplyRequest;
import com.example.pbp.dto.response.ReplyResponse;
import com.example.pbp.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ReplyController {

    @Autowired
    private ReplyService replyService;

    @GetMapping(path = "/reply/{boardId}")
    public ReplyResponse getRepliesResponse(@PathVariable(name = "boardId") int boardId) {
        return replyService.getRepliesResponse(boardId);
    }

    @PostMapping(path = "/add/reply")
    public ResponseEntity<Object> addReply(@RequestBody ReplyRequest replyRequest) {
        replyService.addReply(replyRequest);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/reply/{replyId}")
    public ResponseEntity<Object> deleteReply(@PathVariable(name = "replyId") int replyId) {
        replyService.deleteReply(replyId);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
