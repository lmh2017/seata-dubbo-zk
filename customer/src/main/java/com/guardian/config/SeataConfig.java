package com.guardian.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 17:45
 */
@Configuration
public class SeataConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner("customer","my_test_tx_group");
    }

}
