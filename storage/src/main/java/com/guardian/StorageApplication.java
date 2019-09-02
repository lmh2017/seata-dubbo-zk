package com.guardian;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 14:39
 */
@SpringBootApplication
@DubboComponentScan(basePackages = "com.guardian.service.impl")
public class StorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StorageApplication.class);
    }

}
