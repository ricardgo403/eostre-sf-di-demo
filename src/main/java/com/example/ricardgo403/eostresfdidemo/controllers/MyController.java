package com.example.ricardgo403.eostresfdidemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String getGreeting() {
        System.out.println("Hello world!");
        return "hello, sir!";
    }
}
