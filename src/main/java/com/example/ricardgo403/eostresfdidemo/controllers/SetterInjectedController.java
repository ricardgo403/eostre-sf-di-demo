package com.example.ricardgo403.eostresfdidemo.controllers;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {
    private IGreetingService greetingService;

    @Qualifier("setterGreetingServiceImpl")
    @Autowired
    public void setGreetingService(IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
