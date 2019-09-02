package com.guardian.action;

import com.guardian.service.AccountService;
import com.guardian.service.OperateService;
import com.guardian.service.OrderService;
import com.guardian.service.StorageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 10:59
 */
@RestController
public class TestAction {

    @Autowired
    private OperateService operateService;

    @GetMapping("order")
    public String test(){
        operateService.method();

        return "success";
    }


}
