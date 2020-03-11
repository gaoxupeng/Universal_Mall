package com.mall.utils.mongdb;

import com.mall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mongoDb")
public class MongoDbController {

    @Autowired
    private MongoDbDaoImpl mongoDbDao;

    @RequestMapping("saveUser")
    public void saveUser(){
        User user = new User();
        user.setId((long) 1);
        user.setUsername("张三");
        user.setPassword("123456");
        mongoDbDao.saveUser(user);
    }

    @RequestMapping("findAll")
    public List<User> findAll(){
        return mongoDbDao.findAll();
    }


    @RequestMapping("findUser")
    public User findUserByUserName(String username){
        User user =  mongoDbDao.findUserByUserName(username);
        return user;
    }
}
