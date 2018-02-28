package com.example.testmovie.service;

import com.example.testmovie.DAO.User;

import java.util.List;

public interface ItemService {
    List<User> findItemByPage(int currentPage, int pageSize);
}
