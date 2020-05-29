package com.example.base;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableCaching
@EnableFeignClients
@MapperScan(value = "com.example.base.dao")
public class BaseApplication {

    public BaseApplication() {
    }

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
    }

    public String hideUtilityClass(){
        return "hideUtilityClass";
    }
}