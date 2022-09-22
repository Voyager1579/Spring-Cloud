package com.example.service.impl;

import com.example.service.ProviderService;
import org.springframework.stereotype.Service;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String lesson5() {
        return "最短的捷径就是绕远路！";
    }
}
