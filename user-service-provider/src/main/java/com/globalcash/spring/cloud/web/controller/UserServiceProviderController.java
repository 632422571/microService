package com.globalcash.spring.cloud.web.controller;

import com.globalcash.spring.cloud.domain.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gh
 * @date 2019/1/29 15:10
 */

@RestController
public class UserServiceProviderController {

    private Map<Long, User> repository = new ConcurrentHashMap<>();

    @PostMapping("/user/save")
    public String saveUser(@RequestBody User user) {
        repository.put(user.getId(), user);
        return "OK";
    }
}
