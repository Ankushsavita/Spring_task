package com.geekster.UserManagementSystem.service;

import com.geekster.UserManagementSystem.DAO.UserRepository;
import com.geekster.UserManagementSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements IUserService {

    private static final List<User> users = new ArrayList<>();

    @Autowired
    UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);
    }

    public List<User> findAllUser() {
        return userRepository.findAll();

    }

    public User findUserById(int id) {
       return userRepository.findById(id).get();
    }

    public void updateUserById(int id, User newuser) {

       User user = userRepository.findById(id).get();

       user.setId(newuser.getId());
       user.setUserName(newuser.getUserName());
       user.setName(newuser.getName());
       user.setEmail(newuser.getEmail());
       user.setPassword(newuser.getPassword());
       user.setGender(newuser.getGender());
       user.setPhoneNumber(newuser.getPhoneNumber());
       user.setAddress(newuser.getAddress());

       userRepository.save(user);

    }

    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
