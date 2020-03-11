package com.mall.utils.mongdb;

import com.mall.model.User;

import java.util.List;

public interface MongoDbDao {

    void saveUser(User user);

    User findUserByUserName(String username);

    List<User> findAll();
    int updateUser(User user);

    void deleteUserById(Long id);
}
