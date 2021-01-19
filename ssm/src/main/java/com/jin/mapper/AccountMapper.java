package com.jin.mapper;

import com.jin.domain.Account;

import java.util.List;

public interface AccountMapper {

    public void save(Account account);

    public List<Account> findAll();

}
