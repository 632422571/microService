package com.globalcash.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author gh
 * @date 2019/1/29 15:15
 */

@SpringBootApplication
@EnableHystrix  //使用@EnableHystrix 实现服务提供方短路
@EnableDiscoveryClient  // 激活服务发现客户端
public class UserServiceProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceProviderApplication.class,args);
    }
}
