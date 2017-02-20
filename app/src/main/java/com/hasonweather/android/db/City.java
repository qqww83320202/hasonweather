package com.hasonweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by yhx11 on 2017/2/21.
 */

public class City extends DataSupport {
    private int id;
    private int provinceId;
    private String cityName;
    private int cityCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName=cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
