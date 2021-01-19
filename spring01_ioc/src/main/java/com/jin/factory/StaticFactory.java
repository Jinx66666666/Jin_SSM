package com.jin.factory;

import com.jin.dao.UserDao;
import com.jin.dao.impl.UserDaoImpl;

public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
