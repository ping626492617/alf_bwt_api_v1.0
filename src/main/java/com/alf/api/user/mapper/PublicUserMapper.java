package com.alf.api.user.mapper;

import com.alf.api.entity.PublicUser;

public interface PublicUserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(PublicUser record);

    int insertSelective(PublicUser record);

    PublicUser selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(PublicUser record);

    int updateByPrimaryKey(PublicUser record);
}