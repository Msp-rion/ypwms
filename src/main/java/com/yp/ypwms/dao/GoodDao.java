package com.yp.ypwms.dao;

import com.yp.ypwms.entity.Good;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.Date;

@Mapper
public interface GoodDao {
    //写入mapper 文件

    @Select("select current_date as Systemtime")
    public Good select();
}
