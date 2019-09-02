package com.guardian;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 10:42
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.guardian.service.impl")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }

}
