package com.example.pbp.service;

import com.example.pbp.dto.request.MenuRequest;
import com.example.pbp.dto.response.MenusResponse;

public interface MenuService {
    int MENU_LIMIT = 10;

    MenusResponse getMenusResponse(String boardName);
    void addMenu(MenuRequest menuRequest);
}
