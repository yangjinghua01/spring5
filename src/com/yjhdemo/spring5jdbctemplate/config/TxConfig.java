package com.yjhdemo.spring5jdbctemplate.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration //配置类
@ComponentScan(basePackages = "com.yjhdemo") //组建扫描
@EnableTransactionManagement // 开启事务
public class TxConfig {
//    创建连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");//驱动名称
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/yjh?allowMultiQueries=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull");//数据库地址
        dataSource.setUsername("root");//数据库的用户名
        dataSource.setPassword("123456");
        return dataSource;
    }
//    创建jdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
//注入datasource
        jdbcTemplate.setDataSource(dataSource);
        return  jdbcTemplate;
    }
//    创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager  = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
