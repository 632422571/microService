package com.globalcash.spring.cloud.provider.service;

import com.globalcash.spring.cloud.domain.User;
import com.globalcash.spring.cloud.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gh
 * @date 2019/2/1 14:23
 */
@Service("inMemoryUserService") // Bean 名称
public class InMemoryUserService implements UserService {

    private Map<Long, User> repository = new ConcurrentHashMap<>();

    @Override
    public boolean saveUser(@RequestBody User user) {
        return repository.put(user.getId(), user) == null;
    }

    @Override
    public List<User> findAll() {
        return new ArrayList(repository.values());
    }
}
