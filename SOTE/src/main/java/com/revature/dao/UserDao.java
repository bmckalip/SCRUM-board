package com.revature.dao;

import com.revature.pojo.User;

public interface UserDao {

    //CREATE
    void createUser(User user);
    //READ
    User getUserById(User user);
    User getUserByEmail(User user);
    //UPDATE
    void updateUser(User user);
    //DELETE
    void deleteUser(User user);

}
