package com.guardian.service.impl;

import com.guardian.dao.OrderMapper;
import com.guardian.service.OrderService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.UUID;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 13:58
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void insertOrder() {
        orderMapper.insertOrder(UUID.randomUUID().toString().replace("-",""),new Date());
    }
}
