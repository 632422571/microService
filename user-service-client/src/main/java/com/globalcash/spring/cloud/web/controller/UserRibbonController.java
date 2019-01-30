package com.globalcash.spring.cloud.web.controller;

import com.globalcash.spring.cloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author gh
 * @date 2019/1/29 14:11
 */
@RestController
public class UserRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("")
    public String index() {
        User user = new User();
        user.setId(1L);
        user.setName("晗");

        RestTemplate restTemplate = new RestTemplate();
        String hostName = "localhost";
        int port = 9090;
        String url = "http://" + hostName + ":" + port + "/user/save";

        return restTemplate.postForObject(url,user ,String.class );

    }
}
