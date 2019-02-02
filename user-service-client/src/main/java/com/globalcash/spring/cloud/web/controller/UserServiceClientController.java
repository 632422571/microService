package com.globalcash.spring.cloud.web.controller;

import com.globalcash.spring.cloud.domain.User;
import com.globalcash.spring.cloud.service.TestService;
import com.globalcash.spring.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * @author gh
 * @date 2019/2/1 16:11
 */
@RestController
public class UserServiceClientController implements UserService,TestService {

    @Autowired
    private UserService userService;

    @Autowired
    private TestService testService;

    @Override
    public boolean saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }

    @Override  //若通过继承接口的方式，可继承接口的映射；也可以自己定义一个新的映射，如下
    public String hello(@RequestParam(value = "id") Long id) {
        return testService.hello(id);
    }

    @GetMapping("/hello-test2")
    public String hello2(@RequestParam(value = "id") Long id) {
        return testService.hello(id);
    }

}
