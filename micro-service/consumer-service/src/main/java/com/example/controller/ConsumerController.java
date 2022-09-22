package com.example.controller;

import com.example.service.ConsumerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Consumer")
public class ConsumerController {

    @Resource
    private ConsumerService consumerService;

    @GetMapping
    public String helloCloud(){
        String s = consumerService.requestProvider();
        return s;
    }
}
