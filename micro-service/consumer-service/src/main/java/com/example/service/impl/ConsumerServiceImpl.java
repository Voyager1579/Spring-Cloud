package com.example.service.impl;

import com.example.service.ConsumerService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String requestProvider() {
        String text  = "现在开始，要起飞了！";

        RestTemplate restTemplate = new RestTemplate();
        String s = restTemplate.getForObject("http://localhost:8101/provider/", String.class);
        text = text + s;
        return text;
    }
}
