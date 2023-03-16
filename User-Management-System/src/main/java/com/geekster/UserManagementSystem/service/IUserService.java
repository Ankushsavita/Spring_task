package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.model.User;

import java.util.List;

public interface IUserService {

    void addUser(User user);

    List<User> findAllUser();

    User findUserById(int id);

    void updateUserById(int id, User user);

    void deleteUserById(int id);
}
