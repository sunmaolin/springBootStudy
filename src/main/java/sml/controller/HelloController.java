package sml.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sml.bean.Car;

@Slf4j  // lombok日志
@RestController
public class HelloController {

    @Autowired
    Car car;

    @RequestMapping("/hello")
    public String hello(){
        return "hello boot";
    }

    @RequestMapping("/car")
    public Car car(){
        // 开启@Slf4j 会注入属性log，方便日志打印
        log.info(car.toString());
        return car;
    }
}

