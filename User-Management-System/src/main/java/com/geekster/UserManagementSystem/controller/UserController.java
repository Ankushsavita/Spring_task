package com.geekster.UserManagementSystem.controller;

import com.geekster.UserManagementSystem.model.User;
import com.geekster.UserManagementSystem.service.IUserService;
import com.geekster.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user-app")
public class UserController {

    @Autowired
    private IUserService userService;

    // http://localhost:8081/api/v1/user-app/add-user
    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    // http://localhost:8081/api/v1/user-app/find-all
    @GetMapping("find-all")
    public List<User> findALlUser(){
        return userService.findAllUser();
    }

    // http://localhost:8081/api/v1/user-app/findUser/id/2
    @GetMapping("findUser/id/{id}")
    public User findUserById(@PathVariable int id){
        return userService.findUserById(id);
    }


    // http://localhost:8081/api/v1/user-app/updateUser/id/1
    @PutMapping("updateUser/id/{id}")
    public void updateUserById(@PathVariable int id, @RequestBody User user){
         userService.updateUserById(id, user);
    }

    // http://localhost:8081/api/v1/user-app/deleteUser/id/5
    @DeleteMapping("deleteUser/id/{id}")
    public void deleteUserById(@PathVariable int id){
        userService.deleteUserById(id);
    }
}
