package com.example.pbp.controller;

import com.example.pbp.dto.request.MenuRequest;
import com.example.pbp.dto.response.MenusResponse;
import com.example.pbp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping(path = "/menus")
    public MenusResponse getMenus(@RequestParam(name = "boardName", defaultValue = "") String boardName) {
        return menuService.getMenusResponse(boardName);
    }

    @PostMapping(path = "/add/menu")
    public ResponseEntity<Object> addMenu(@RequestBody MenuRequest menuRequest) {
        menuService.addMenu(menuRequest);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
}
