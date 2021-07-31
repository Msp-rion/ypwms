package com.yp.ypwms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.yp.ypwms.dao"})
public class YpwmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(YpwmsApplication.class, args);
    }

}
