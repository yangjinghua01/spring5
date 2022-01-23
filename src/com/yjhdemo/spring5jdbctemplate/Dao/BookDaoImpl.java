package com.yjhdemo.spring5jdbctemplate.Dao;

import com.yjhdemo.spring5jdbctemplate.yjh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


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

    //查询表中的记录数
    @Override
    public int selectcount() {
        String sql = "select count(*) from yjh";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        return count;
    }

    @Override
    public yjh selectocj(int id) {
        String sql = "select * from yjh where id =?";
        /***
         * 第一个参数 sql语句
         * 第二个参数RowMapper   =============>new BeanPropertyRowMapper<yjh>(yjh.class)其中的泛型和类都是指的对应数据库的实体类
         * 第三个参数sql语句值
         */
        yjh yjh1 = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<yjh>(yjh.class), id);
        return yjh1;
    }
//返回list集合
    @Override
    public List<yjh> selectlist() {
        String sql = "select * from yjh";
        List<yjh> yjhList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<yjh>(yjh.class));
        return yjhList;
    }
//    jdbc批量操作
    @Override
    public void addlist(List<Object[]> list) {
        String sql = "insert into yjh values(?,?,?,?)";
        int[] lists = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(lists.toString());
    }

    @Override
    public void xiulist(List<Object[]> list) {
        String sql = "update yjh set name = ?,sex = ?,likename =? where id = ?";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));

    }

    @Override
    public void dellist(List<Object[]> list) {
        String sql = "delete from yjh where id =?";
        int[] ints = jdbcTemplate.batchUpdate(sql, list);
        System.out.println(Arrays.toString(ints));

    }

}
