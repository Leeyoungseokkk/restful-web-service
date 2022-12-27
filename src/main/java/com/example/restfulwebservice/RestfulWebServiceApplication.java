package com.example.restfulwebservice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;


@Configuration
@SpringBootApplication
public class RestfulWebServiceApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(RestfulWebServiceApplication.class, args);

        }
    }

