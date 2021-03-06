package com.example.ricardgo403.eostresfdidemo.controllers;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Autowired
    public IGreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
