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

    /**
     * 保存用户信息
     */
    @RequestMapping("saveUser")
    public void saveUser(User user){
       /* User user = new User();
        user.setId((long) 1);
        user.setUsername("张三");
        user.setPassword("123456");*/
        mongoDbDao.saveUser(user);
    }

    /**
     * 查询所有用户信息
     * @return
     */
    @RequestMapping("findAll")
    public List<User> findAll(){
        return mongoDbDao.findAll();
    }


    /**
     * 根据传入参数查询对应用户
     * @param username
     * @return
     */
    @RequestMapping("findUser")
    public User findUserByUserName(String username){
        User user =  mongoDbDao.findUserByUserName(username);
        return user;
    }
}
