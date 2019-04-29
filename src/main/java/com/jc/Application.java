package com.jc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/3/4 14:46
 * @description：后台启动类
 * @modified By：
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("com.jc.modules.*.mapper")
@SpringBootConfiguration
@EnableTransactionManagement
@EnableScheduling
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
