package com.geekster.fooddeliveryapp.controller;

import com.geekster.fooddeliveryapp.model.User;
import com.geekster.fooddeliveryapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("add-user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("find-user/id/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

    @GetMapping("find-user/username/{username}")
    public User getUserByUsername(@PathVariable String username) {
        return userService.getUserByUsername(username);
    }

    @GetMapping("find-all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PutMapping("update/id/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("delete/id/{id}")
    public void deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
    }
}

