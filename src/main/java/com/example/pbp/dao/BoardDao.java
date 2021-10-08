package com.example.pbp.dao;

import com.example.pbp.dto.Board;
import com.example.pbp.dto.request.BoardRequest;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardDao {
    List<Board> selectBoards();
    Board selectBoardById(int boardId);
    int insertBoard(BoardRequest boardRequest);
    int deleteBoardById(int boardId);
    int updateBoardById(BoardRequest boardRequest, int boardId);

}
