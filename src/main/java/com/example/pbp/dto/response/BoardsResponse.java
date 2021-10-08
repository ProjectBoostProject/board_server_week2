package com.example.pbp.dto.response;

import com.example.pbp.dto.Board;
import lombok.Data;

import java.util.List;

@Data
public class BoardsResponse {
    private List<Board> boards;
}
