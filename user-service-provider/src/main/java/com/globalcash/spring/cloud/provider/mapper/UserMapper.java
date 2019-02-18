package com.globalcash.spring.cloud.provider.mapper;

import com.globalcash.spring.cloud.domain.User;

import java.util.List;

public interface UserMapper {
    public List<User> getData();
}
