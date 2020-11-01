package com.duoyi.springbootssm.dao;

import com.duoyi.springbootssm.domain.User;

import java.util.List;

public interface UserDao {
    int addUser(User user);

    int deleteUser(User user);

    int updateUser(User user);

    List<User> searchAllUser();

    User searchUserById(int id);
}
