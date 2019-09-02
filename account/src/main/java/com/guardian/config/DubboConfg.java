package com.guardian.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/29
 * time: 17:23
 */
@Configuration
public class DubboConfg {

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        return new ProtocolConfig("dubbo",20880);
    }

    @Bean
    public ApplicationConfig applicationConfig(){
        return new ApplicationConfig("account");
    }

}
