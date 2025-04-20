package com.bkty.springwebflux.controller;

import com.bkty.springwebflux.entity.User;
import com.bkty.springwebflux.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public Mono<User> saveUser(User user) {
        return userService.save(user);

    }

    @PutMapping("/update")
    public Mono<String> updateUser(User user) {
        return userService.updateUser(user).map(user0 -> "更新成功");

    }

    @GetMapping("/findallUser")
    public Mono<String> findallUser() {
        return userService.AllUser().map(user -> user.toString()).collectList().map(userList -> userList.toString());

    }

}
