package com.furao.edas.provider;

import com.furao.edas.Product;
import com.furao.edas.ProductService;

import java.sql.Date;

public class ServiceImpl implements ProductService {
    public Product printTodayWeather() {
        Product product = new Product();
        product.setCurDate(new Date(System.currentTimeMillis()));
        product.setProductId("PRO-A1");
        product.setCurWeather("今天天气：晴 最高温度16度，最低温度1度");
        return product;
    }
}
