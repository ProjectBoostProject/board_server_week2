package com.example.pbp.dto.response;

import com.example.pbp.dto.Menu;
import lombok.Data;

import java.util.List;

@Data
public class MenusResponse {
    private List<Menu> menus;
}
