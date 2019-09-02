package com.guardian.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/9/2
 * time: 9:59
 */
@Configuration
public class SeataConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionDO(){
        return new GlobalTransactionScanner("account","my_test_tx_group");
    }

}
