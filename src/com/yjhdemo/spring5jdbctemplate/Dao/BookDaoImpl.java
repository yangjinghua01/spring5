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
        Object[] args = {yjh.getName(), yjh.getSex(), yjh.getLikename()};
        int update = jdbcTemplate.update(sql, yjh.getId(), yjh.getName(), yjh.getSex(), yjh.getLikename());
        System.out.println(update);
    }

    //修改的方法实现
    @Override
    public void xiugai(yjh yjh) {
        String sql = "update yjh set name = ?,sex = ?,likename =? where id = ?";
        int update = jdbcTemplate.update(sql, yjh.getName(), yjh.getSex(), yjh.getLikename(), yjh.getId());
        System.out.println(update);
    }

    //删除的方法实现
    @Override
    public void del(int id) {
        String sql = "delete from yjh where id =?";
        int row = jdbcTemplate.update(sql, id);
        System.out.println(row);
    }
}
