package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World! - From the Primary Bean";
    }
}
