package com.jc.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/3/12 17:24
 * @description：配置分页插件
 * @modified By：
 * @version:
 */

@Configuration
public class MybatisPlusConfig {


/**
     * 使用PaginationInterceptor插件，交给Spring容器管理
     * @return PaginationInterceptor对象
     */

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        return paginationInterceptor;
    }
}

