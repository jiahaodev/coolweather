package com.jiahaodev.ch14_coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WilliamWu on 2017/2/11.
 * 功能：省级信息 实体类
 */

public class Province extends DataSupport {

    private int id;    //数据库自增长 id
    private String provinceName;
    private int provinceCode;//网络json信息中的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
