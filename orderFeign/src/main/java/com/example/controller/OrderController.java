package com.example.controller;

import com.example.feign.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    ServiceFeign serviceFeign;
    @RequestMapping("/add")
    public String add() {
        System.out.println("下单成功");
        String forObject = serviceFeign.reduct();
        return "hello world" + forObject;
    }

}
