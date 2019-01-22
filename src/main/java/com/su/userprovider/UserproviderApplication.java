package com.su.userprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.su.dao.user")
@ImportResource("classpath:dubboprovider.xml")
@ServletComponentScan("com.su.userprovider.druid")
public class UserproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserproviderApplication.class, args);
    }

}

