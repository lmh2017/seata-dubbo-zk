package com.guardian.service.impl;

import com.guardian.dao.StorageMapper;
import com.guardian.service.StorageService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * description:
 * create by: guardian_liu
 * date: 2019/8/30
 * time: 13:59
 */
@Service
@Component
public class StorageServiceImpl implements StorageService {

    @Autowired
    public StorageMapper storageMapper;

    @Override
    public void updateStorage() {
        storageMapper.updateStorage(0);
    }
}
