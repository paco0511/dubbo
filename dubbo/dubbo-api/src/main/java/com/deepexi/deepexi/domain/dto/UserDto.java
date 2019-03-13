package com.deepexi.deepexi.domain.dto;

import java.util.Collection;
import java.util.List;
import java.util.Date;
import java.io.Serializable;

/**
 * @desc 用户管理
 * @author 
 */
public class UserDto implements Serializable {
    private Integer  id;

    private String code;

    private String createBy;

    private String createTime;

    private String name;

    private String status;

    private String updateBy;

    private String updateTime;

    private String systemTenant;

    private String domain;

    private Integer  dr;


    public void setId(Integer  id){
        this.id = id;
    }

    public Integer  getId(){
        return this.id;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getCode(){
        return this.code;
    }

    public void setCreateBy(String createBy){
        this.createBy = createBy;
    }

    public String getCreateBy(){
        return this.createBy;
    }

    public void setCreateTime(String createTime){
        this.createTime = createTime;
    }

    public String getCreateTime(){
        return this.createTime;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }

    public void setUpdateBy(String updateBy){
        this.updateBy = updateBy;
    }

    public String getUpdateBy(){
        return this.updateBy;
    }

    public void setUpdateTime(String updateTime){
        this.updateTime = updateTime;
    }

    public String getUpdateTime(){
        return this.updateTime;
    }

    public void setSystemTenant(String systemTenant){
        this.systemTenant = systemTenant;
    }

    public String getSystemTenant(){
        return this.systemTenant;
    }

    public void setDomain(String domain){
        this.domain = domain;
    }

    public String getDomain(){
        return this.domain;
    }

    public void setDr(Integer  dr){
        this.dr = dr;
    }

    public Integer  getDr(){
        return this.dr;
    }
}

