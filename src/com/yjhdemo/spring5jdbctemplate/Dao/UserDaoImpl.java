package com.yjhdemo.spring5jdbctemplate.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //增加
    @Override
    public void addMoney() {
        String sql = "update t_account set money = money + ? where username = ? ";
        int lucy = jdbcTemplate.update(sql, 100, "mary");
        System.out.println("增加成功"+lucy);
    }

    //减少
    @Override
    public void reduceMoney() {
        String sql = "update t_account set money = money - ? where username = ? ";
        int lucy = jdbcTemplate.update(sql, 100, "lucy");
        System.out.println("减少成功"+lucy);
    }
}
