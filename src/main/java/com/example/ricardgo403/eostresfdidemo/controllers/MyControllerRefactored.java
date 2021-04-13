package com.example.ricardgo403.eostresfdidemo.controllers;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyControllerRefactored {
    private final IGreetingService greetingService;

    public MyControllerRefactored(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
