package com.globalcash.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author gh
 * @date 2019/1/29 14:18
 */

@RibbonClient("user-service-provider") // 指定目标应用名称
@SpringBootApplication
public class UserServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceClientApplication.class,args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
