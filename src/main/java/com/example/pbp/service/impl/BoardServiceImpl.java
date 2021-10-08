package com.example.pbp.service.impl;

import com.example.pbp.dao.BoardDao;
import com.example.pbp.dto.request.BoardRequest;
import com.example.pbp.dto.response.BoardResponse;
import com.example.pbp.dto.response.BoardsResponse;
import com.example.pbp.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public BoardsResponse getBoardsResponse() {
        BoardsResponse boardsResponse = new BoardsResponse();
        boardsResponse.setBoards(boardDao.selectBoards());

        return boardsResponse;
    }

    @Override
    public BoardResponse getBoardResponseById(int boardId) {
        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setBoard(boardDao.selectBoardById(boardId));
        return boardResponse;
    }

    @Override
    public void addBoard(BoardRequest boardRequest) {
        int insertBoard = boardDao.insertBoard(boardRequest);

        if(insertBoard != 1) {
            log.error("게시판 작성 중 에러가 발생하였습니다.");
        }
    }

    @Override
    public void updateBoardById(int boardId, BoardRequest boardRequest) {
        int updateBoard = boardDao.updateBoardById(boardRequest, boardId);
        if(updateBoard != 1) {
            log.error("게시판 수정 중 에러가 발생하였습니다.");
        }
    }

    @Override
    public void deleteBoardById(int boardId) {
        int deleteBoard = boardDao.deleteBoardById(boardId);
        if(deleteBoard != 1) {
            log.error("게시판 삭제 중 에러가 발생하였습니다.");
        }
    }

}
