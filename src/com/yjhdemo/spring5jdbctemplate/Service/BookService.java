package com.yjhdemo.spring5jdbctemplate.Service;

import com.yjhdemo.spring5jdbctemplate.Dao.BookDao;
import com.yjhdemo.spring5jdbctemplate.yjh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
//    查询表记录数
    public int selectcount(){
        return bookDao.selectcount();
    }
//    查询返回对象
    public yjh selectobj(int id){
        return bookDao.selectocj(id);
    }
//    返回list
    public List<yjh> selectlist(){
        return bookDao.selectlist();
    }
//    批量添加
    public void addlist(List<Object[]>list){
        bookDao.addlist(list);
    }
//    批量修改
    public void xiuadd(List<Object[]>list){
        bookDao.xiulist(list);
    }
//    批量删除
      public void  dellist(List<Object[]>list){
        bookDao.dellist(list);
      }
}
