package com.guardian.service.impl;

import com.guardian.dao.AccountMapper;
import com.guardian.service.AccountService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/29
 * time: 16:49
 */
@Service
@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public void updateAccount(){
        accountMapper.updateAccount(BigDecimal.valueOf(0),BigDecimal.valueOf(0));
    }


}
