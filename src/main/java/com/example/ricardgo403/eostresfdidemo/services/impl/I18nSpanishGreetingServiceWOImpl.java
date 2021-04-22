package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES", "default"})
//@Service("i18nService")
public class I18nSpanishGreetingServiceWOImpl implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hola, Mundo! - ES";
    }
}
