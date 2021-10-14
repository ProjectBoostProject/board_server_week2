package com.example.pbp.dao;

import com.example.pbp.dto.Menu;
import com.example.pbp.dto.request.MenuRequest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    List<Menu> selectMenusByName(String boardName, @Param("limit") int limit);
    int insertMenu(MenuRequest menuRequest);
}
