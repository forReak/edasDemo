package com.furao.edas;

import java.sql.Date;

/**
 * 定义了返回对象的内容
 */
public class Product {
    private String productId;
    private Date curDate;
    private String curWeather;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getCurDate() {
        return curDate;
    }

    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }

    public String getCurWeather() {
        return curWeather;
    }

    public void setCurWeather(String curWeather) {
        this.curWeather = curWeather;
    }

    @Override
    public String toString() {
        return "信息：{" +
                "productId='" + productId + '\'' +
                ", 日期=" + curDate +
                ", 天气情况='" + curWeather + '\'' +
                '}';
    }
}
