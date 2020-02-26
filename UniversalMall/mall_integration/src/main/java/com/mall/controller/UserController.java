package com.mall.controller;


import com.mall.model.TbUser;
import com.mall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("getAllUser")
    public List<TbUser> getAllUsers(){
        List<TbUser> userList = userService.list();
        LOG.info("查询到的数据为"+userList);
        return userList;
    }

    @RequestMapping("addUser")
    public Boolean addUser(TbUser user){
        boolean flag = userService.save(user);
        return flag;
    }

    /**
     * 异常处理
     */
    @RequestMapping("error")
    public void error(){
        int i = 1/0;
    }

    /**
     * 异常处理
     */
    @RequestMapping("nullException")
    public void nullException(){
       String str = null;
       str.indexOf(",");
    }
}
