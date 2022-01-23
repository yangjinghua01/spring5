package com.yjhdemo.spring5jdbctemplate.Service;

import com.yjhdemo.spring5jdbctemplate.Dao.BookDao;
import com.yjhdemo.spring5jdbctemplate.yjh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    //    注入dao
    @Autowired
    private BookDao bookDao;

    //    添加方法
    public void addyjh(yjh yjh) {
        bookDao.add(yjh);
    }

    //    修改方法
    public void xiugai(yjh yjh) {
        bookDao.xiugai(yjh);
    }

    //    删除方法
    public void delbook(int id) {
        bookDao.del(id);
    }
}
