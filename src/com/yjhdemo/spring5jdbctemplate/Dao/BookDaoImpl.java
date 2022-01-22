package com.yjhdemo.spring5jdbctemplate.Dao;

import com.yjhdemo.spring5jdbctemplate.yjh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
//    注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(yjh yjh) {
        String sql = "insert into yjh values(?,?,?,?)";
//        调用方法实现
        Object[] args = {yjh.getName(),yjh.getSex(),yjh.getLikename()};
     int update =   jdbcTemplate.update(sql,yjh.getId(),yjh.getName(),yjh.getSex(),yjh.getLikename());
        System.out.println(update);
    }
}
