package com.example.base.aop.configure;

import feign.Logger;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Jagger
 * @create: 2020/3/17 11:30
 */
@Configuration
public class OpenFeignConfiguration {

    public OpenFeignConfiguration() {
    }

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
