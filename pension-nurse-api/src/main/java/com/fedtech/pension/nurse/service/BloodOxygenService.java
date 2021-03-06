package com.fedtech.pension.nurse.service;


import com.alibaba.fastjson.JSONObject;
import com.fedtech.commons.base.BaseService;
import com.fedtech.pension.nurse.entity.BloodOxygen;

/**
 * @author fan
 */
public interface BloodOxygenService extends BaseService<BloodOxygen> {

    /**
     * 接受JSON数据存入数据库
     * @param jsonObject
     * @return
     */
    public Integer bloodOxygen2Json(JSONObject jsonObject);
}
