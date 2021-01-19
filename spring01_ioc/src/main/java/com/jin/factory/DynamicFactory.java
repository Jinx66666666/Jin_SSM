package com.jin.factory;

import com.jin.dao.UserDao;
import com.jin.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
