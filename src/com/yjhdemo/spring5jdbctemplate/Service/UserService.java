package com.yjhdemo.spring5jdbctemplate.Service;

import com.yjhdemo.spring5jdbctemplate.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserDao userDao;

    //    转账的方法
    public void accountMoney() {
//        try {
////        开启事务操作
////第二步进行业务操作
////                lucy少100
//            userDao.reduceMoney();
////        mary多100
//            int i = 10 / 0;
//            userDao.addMoney();
////            第三步如果没出现异常提交事务
//        } catch (Exception e) {
////出现异常回滚
//
//        }


//    lucy少100
        userDao.reduceMoney();
//        mary多100
        int i =10/0;
        userDao.addMoney();
    }
}
