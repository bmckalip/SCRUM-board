package com.revature.dao;

import com.revature.pojo.User;

public interface UserDao {

    void createUser(User user);
    User getUserById(User user);
}
