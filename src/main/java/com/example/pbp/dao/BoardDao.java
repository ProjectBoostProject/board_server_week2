package com.example.pbp.dao;

import com.example.pbp.dto.Board;
import com.example.pbp.dto.request.BoardRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardDao {
    List<Board> selectBoards(@Param("menuId") int menuId, @Param("start") int start, @Param("limit") int limit);
    int selectCountBoardsByMenu(@Param("menuId") int menuId);
    Board selectBoardById(int boardId);
    int insertBoard(BoardRequest boardRequest);
    int deleteBoardById(int boardId);
    int updateBoardById(BoardRequest boardRequest, int boardId);

}
