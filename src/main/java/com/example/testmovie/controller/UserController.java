package com.example.testmovie.controller;

import com.example.testmovie.DAO.User;
import com.example.testmovie.message.Result;
import com.example.testmovie.service.ItemService;
import com.example.testmovie.service.UserService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@Controller
@RestController
@RequestMapping("/movie/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;


    @RequestMapping("/getAllUser")
    public ArrayList<User> getAllUser(){
        return userService.getAll();
    }

    /**
     *
     * @param users jackson 数据
     * @return
     */
    @RequestMapping("/addUser")
    public int addUser(ArrayList<User> users){
//        return new Integer(userService.addUser(new User(new Long(1), "赵正兰", "123456789")));
        return userService.addUsers(users);
    }

    /**
     * 商品分页功能(集成mybatis的分页插件pageHelper实现)
     *
     * @param currentPage    :当前页数
     * @param pageSize        :每页显示的总记录数
     * @return
     */
    @RequestMapping(value = "/itemsPage/{currentPage}/{pageSize}", method = RequestMethod.GET)
    public List<User> itemsPage(@PathVariable int currentPage, @PathVariable int pageSize){
        return itemService.findItemByPage(currentPage, pageSize);
    }

    @RequestMapping(value = "/getUser", method = {RequestMethod.POST, RequestMethod.GET})
    public User getUser(Long id){
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/loginAction", method = {RequestMethod.POST})
    public Result login(String name, String paswd){
        return userService.login(new User(name, paswd));
    }

    @RequestMapping(value = "/registerAction", method = RequestMethod.POST)
    public Result register(String name, String paswd){
        return userService.register(new User(name, paswd));
    }
}
