package com.jin.mapper;

import com.jin.domain.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll();

    public List<User> findUserAndRoleAll();

}
