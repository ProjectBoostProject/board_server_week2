package com.example.pbp.dto.response;

import com.example.pbp.dto.Board;
import com.example.pbp.dto.Menu;
import lombok.Data;

import java.util.List;

@Data
public class BoardsResponse {
    private int totalCount;
    private List<Board> boards;
    private Menu menu;
}
