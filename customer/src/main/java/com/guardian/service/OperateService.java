package com.guardian.service;

import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 16:26
 */
@Service
@Slf4j
public class OperateService {

    @Reference
    private AccountService accountService;

//    @Reference
//    private OrderService orderService;
//
//    @Reference
//    private StorageService storageService;

    @GlobalTransactional(name = "customer")
    public void method(){
        log.info("开启全局事务,XID:{}", RootContext.getXID());
        //创建订单
//        orderService.insertOrder();
        //测试分布式锁
        //扣减账户
        accountService.updateAccount();
        if(true){
            throw new RuntimeException();
        }


        //扣减库存
//        storageService.updateStorage();
    }

}
