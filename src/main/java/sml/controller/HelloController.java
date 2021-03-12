package sml.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sml.bean.Car;

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
        return car;
    }
}

