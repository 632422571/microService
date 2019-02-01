package com.globalcash.spring.cloud.web.controller;

import com.globalcash.spring.cloud.domain.User;
import com.globalcash.spring.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * @author gh
 * @date 2019/2/1 16:11
 */
@RestController
public class UserServiceClientController implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }
}
