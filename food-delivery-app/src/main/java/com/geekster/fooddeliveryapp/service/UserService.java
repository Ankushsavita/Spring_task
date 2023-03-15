package com.geekster.fooddeliveryapp.service;

import com.geekster.fooddeliveryapp.dao.UserRepository;
import com.geekster.fooddeliveryapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private static List<User> users = new ArrayList<>();

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int id) {
        return (User) userRepository.findById(id).get();
    }

    public User getUserByUsername(String username) {
        return (User) userRepository.findByUsername(username);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(int id, User newuser) {
        User user =  userRepository.findById(id).get();

        user.setId(newuser.getId());
        user.setUsername(newuser.getUsername());
        user.setPassword(newuser.getPassword());
        user.setAddress(newuser.getAddress());

        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }
}

