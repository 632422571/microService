package com.globalcash.spring.cloud;

import com.globalcash.spring.cloud.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author gh
 * @date 2019/1/29 14:18
 */

// 多个 Ribbon 定义
@RibbonClients({
        @RibbonClient(name = "user-service-provider")
})
//@RibbonClient("user-service-provider") // 指定目标应用名称
@EnableDiscoveryClient
@SpringBootApplication
@EnableCircuitBreaker // 使用服务短路
@EnableFeignClients(clients = UserService.class) // 声明 UserService 接口作为 Feign Client 调用
public class UserServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceClientApplication.class,args);
    }


    //声明 RestTemplate
    @LoadBalanced // RestTemplate 的行为变化
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
