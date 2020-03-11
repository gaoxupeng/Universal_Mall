package com.mall.utils.mongdb;

import com.mall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

@Component
public class MongoDbDaoImpl implements MongoDbDao{

    @Autowired
    private MongoTemplate mongoTemplatel;

    @Override
    public void saveUser(User user) {
        mongoTemplatel.save(user);
    }

    @Override
    public User findUserByUserName(String username) {
        Query query = new Query(Criteria.where("username").is(username));
        User user = (User) mongoTemplatel.findOne(query,User.class);

        return user;
    }

    @Override
    public List<User> findAll() {
        return mongoTemplatel.findAll(User.class);
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public void deleteUserById(Long id) {
        Query query=new Query(Criteria.where("id").is(id));
        mongoTemplatel.remove(query,User.class);
    }
}
