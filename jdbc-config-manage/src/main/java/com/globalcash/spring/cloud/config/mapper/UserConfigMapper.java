package com.globalcash.spring.cloud.config.mapper;

import com.globalcash.spring.cloud.config.domain.UserConfig;

import java.util.List;

public interface UserConfigMapper {
    public List<UserConfig> getUserConfig();

    public int updateUserConfig(UserConfig userConfig);
}
