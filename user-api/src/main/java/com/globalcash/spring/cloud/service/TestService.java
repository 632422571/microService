package com.globalcash.spring.cloud.service;

import com.globalcash.spring.cloud.fallback.UserServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gh
 * @date 2019/2/2 9:42
 */

@FeignClient(name = "${user.service.name}") // 利用占位符避免未来整合硬编码
public interface TestService {

    @GetMapping("/hello-test")
    public String hello(@RequestParam(value = "id") Long id);
}
