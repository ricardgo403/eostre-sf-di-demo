package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;

public class PrimaryGreetingServiceWO implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello, World! - From the Primary Bean WO";
    }
}
