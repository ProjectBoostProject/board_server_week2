package com.example.pbp.service.impl;

import com.example.pbp.dao.MenuDao;
import com.example.pbp.dto.request.MenuRequest;
import com.example.pbp.dto.response.MenuResponse;
import com.example.pbp.dto.response.MenusResponse;
import com.example.pbp.service.MenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuDao menuDao;


    @Override
    public MenusResponse getMenusResponse(String boardName) {
        MenusResponse menusResponse = new MenusResponse();
        menusResponse.setMenus(menuDao.selectMenusByName(boardName, MENU_LIMIT));
        return menusResponse;
    }

    @Override
    public MenuResponse addMenu(MenuRequest menuRequest) {
        int insertMenu = menuDao.insertMenu(menuRequest);

        if(insertMenu < 1) {
            log.error("메뉴 작성 중 에러가 발생하였습니다.");
        }
        MenuResponse menuResponse = new MenuResponse();
        menuResponse.setMenu(menuDao.selectMenuByMenuId(menuRequest.getId()));

        return menuResponse;
    }
}
