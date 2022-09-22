package com.example.controller;

import com.example.service.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/provider")
@RestController
public class ProviderController {

    @Resource
    private ProviderService providerService;

    @GetMapping
    public String riderRevolve(){
        String s = providerService.lesson5();
        return s;
    }
}
