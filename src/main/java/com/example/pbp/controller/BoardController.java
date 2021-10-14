package com.example.pbp.controller;

import com.example.pbp.dto.request.BoardRequest;
import com.example.pbp.dto.response.BoardResponse;
import com.example.pbp.dto.response.BoardsResponse;
import com.example.pbp.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping(path = "/boards/{menuId}")
    public BoardsResponse getBoards(@PathVariable(name = "menuId") int menuId,
                                    @RequestParam(name = "pageNum", defaultValue = "0") int pageNum) {
        return boardService.getBoardsResponse(menuId, pageNum);
    }

    @GetMapping(path = "/board/{boardId}")
    public BoardResponse getBoardById(@PathVariable(name = "boardId") int boardId) {
        return boardService.getBoardResponseById(boardId);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<Object> addBoard(@RequestBody BoardRequest boardRequest) {
        boardService.addBoard(boardRequest);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @PutMapping(path = "/update/{boardId}")
    public ResponseEntity<Object> updateBoard(@PathVariable(name = "boardId") int boardId,
                                              @RequestBody BoardRequest boardRequest) {
        boardService.updateBoardById(boardId, boardRequest);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @DeleteMapping(path = "/delete/{boardId}")
    public ResponseEntity<Object> delete(@PathVariable(name = "boardId") int boardId) {
        boardService.deleteBoardById(boardId);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
