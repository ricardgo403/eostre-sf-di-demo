package com.example.ricardgo403.eostresfdidemo.repositories.impl;

import com.example.ricardgo403.eostresfdidemo.repositories.EnglishGreetingRepository;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/22/21
 ***/
public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello, World! - EN-AU - repository";
    }
}
