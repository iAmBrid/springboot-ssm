package com.duoyi.springbootssm.controller;

import com.duoyi.springbootssm.domain.User;
import com.duoyi.springbootssm.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/searchAllUser")
    public List<User> searchAllUser() {
        return userService.searchAllUser();
    }

    @PostMapping("/searchUserById")
    public User searchUserById(@RequestBody Map<String, String> requestParam) {
        return userService.searchUserById(Integer.parseInt(requestParam.get("id")));
    }

    @PostMapping("/addUser")
    public Map addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/updateUser")
    public Map updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    public Map deleteUser(@RequestBody User user) {
        return userService.delteUser(user);
    }
}
