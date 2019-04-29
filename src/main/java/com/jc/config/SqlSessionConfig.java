/*
package com.jc.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;

*/
/**
 * @author ：fenghuang
 * @date ：Created in 2019/3/18 15:39
 * @description：
 * @modified By：
 * @version:
 *//*

@Configuration
public class SqlSessionConfig extends SqlSessionDaoSupport {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }


    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory)
    {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Bean
    public void test(){
        System.out.println("SqlSessionConfig.test");
    }
}
*/
