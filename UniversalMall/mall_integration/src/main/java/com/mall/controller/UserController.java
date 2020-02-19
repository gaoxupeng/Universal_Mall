package com.mall.controller;


import com.mall.model.TbUser;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author gxp
 * @since 2020-02-19
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    public UserService userService;

    @RequestMapping("getAllUser")
    public List<TbUser> getAllUsers(){
        List<TbUser> userList = userService.list();
        return userList;
    }
}
