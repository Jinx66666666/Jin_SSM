package com.jin.service;

import com.jin.domain.Account;

import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();

}
