package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceAnnotationImpl implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, Sir @ricardgo403!";
    }
}
