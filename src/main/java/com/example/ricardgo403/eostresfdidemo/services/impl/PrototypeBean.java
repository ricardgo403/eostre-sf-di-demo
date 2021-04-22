package com.example.ricardgo403.eostresfdidemo.services.impl;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/22/21
 ***/
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("Creating prototype bean");
    }

    public String getMyScope() {
        return "Prototype";
    }
}
