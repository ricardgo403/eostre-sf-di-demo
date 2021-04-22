package com.example.ricardgo403.eostresfdidemo.services.impl;

import org.springframework.stereotype.Component;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/22/21
 ***/
@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating a singleton bean!!!!");
    }

    public String getMyScope() {
        return "singleton";
    }
}
