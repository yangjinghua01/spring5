package com.yjhdemo.spring5jdbctemplate.Dao;

import com.yjhdemo.spring5jdbctemplate.yjh;

import java.util.List;

public interface BookDao {
//    添加的方法
    void add (yjh yjh);
    void xiugai(yjh yjh);
    void  del (int id);
    int selectcount();
    yjh selectocj(int id);
    List<yjh> selectlist();
    void addlist(List<Object[]>list);
    void xiulist(List<Object[]>list);
    void dellist(List<Object[]>list);
}
