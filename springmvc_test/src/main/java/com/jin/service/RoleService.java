package com.jin.service;

import com.jin.domain.Role;

import java.util.List;

public interface RoleService {
    public List<Role> list() ;

    void save(Role role);
}
