package com.furao.edas.consumer;

import com.furao.edas.Product;
import com.furao.edas.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContextEvent;

@Controller
public class GetWeatherController {

    //resource 注解会从上下文中获取唯一bean
    @Resource
    ProductService productService;

    @RequestMapping("/")
    public String getWeather( Model model){

        Product product = productService.printTodayWeather();
        model.addAttribute("result",product);
        return "index";
    }
}
