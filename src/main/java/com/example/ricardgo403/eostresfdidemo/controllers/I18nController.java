package com.example.ricardgo403.eostresfdidemo.controllers;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final IGreetingService greetingService;

    public I18nController(@Qualifier("i18nService") IGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
