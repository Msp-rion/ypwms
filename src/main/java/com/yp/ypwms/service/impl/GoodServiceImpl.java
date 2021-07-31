package com.yp.ypwms.service.impl;

import com.yp.ypwms.dao.GoodDao;
import com.yp.ypwms.entity.Good;
import com.yp.ypwms.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GoodServiceImpl implements GoodService {

    @Autowired
    public GoodDao goodDao;

    @Override
    public Good select() {
        return goodDao.select();
    }
}
