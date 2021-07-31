package com.yp.ypwms.entity;

import java.io.Serializable;
import java.util.Date;

public class Good implements Serializable {

    private String xuhao;
    private String name;
    private String unit;
    private String storeNum;
    private String price;
    private String sumPrice;
    private String goodType;
    private Date Systemtime;

    public Date getSystemtime() {
        return Systemtime;
    }

    public void setSystemtime(Date systemtime) {
        Systemtime = systemtime;
    }

    public String getXuhao() {
        return xuhao;
    }

    public void setXuhao(String xuhao) {
        this.xuhao = xuhao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getStoreNum() {
        return storeNum;
    }

    public void setStoreNum(String storeNum) {
        this.storeNum = storeNum;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(String sumPrice) {
        this.sumPrice = sumPrice;
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }
}
