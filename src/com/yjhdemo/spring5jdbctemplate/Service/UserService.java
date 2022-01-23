package com.yjhdemo.spring5jdbctemplate.Service;

import com.yjhdemo.spring5jdbctemplate.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    //    转账的方法
    public void accountMoney() {
//    lucy少100
        userDao.reduceMoney();
//        mary多100
        userDao.addMoney();
    }
}
