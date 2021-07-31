package com.yp.ypwms.controller;

import com.yp.ypwms.entity.Good;
import com.yp.ypwms.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/apis")
public class TestController {

    @Autowired
    GoodService goodService;


    @RequestMapping("/queryAll")
    public @ResponseBody
    Map queryAll() {
        Map map = new HashMap();
        try {
            Good select = goodService.select();
            map.put("code", 1);
            map.put("data", select);
        } catch (Exception e) {
            map.put("code", 0);
            e.printStackTrace();
        }
        return map;
    }
}
