package com.example.ricardgo403.eostresfdidemo.configs;

import com.example.ricardgo403.eostresfdidemo.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/20/21
 ***/
@Configuration
public class GreetingServiceConfig {

    @Primary
    @Bean
    PrimaryGreetingServiceWO primaryGreetingServiceWO() {
        return new PrimaryGreetingServiceWO();
    }

    @Bean
    ConstructorGreetingServiceWOImpl constructorGreetingServiceWO(){
        return new ConstructorGreetingServiceWOImpl();
    }

    @Bean
    PropertyGreetingServiceWOImpl propertyGreetingServiceWO(){
        return new PropertyGreetingServiceWOImpl();
    }

    @Bean
    SetterGreetingServiceWOImpl setterGreetingServiceWO(){
        return new SetterGreetingServiceWOImpl();
    }

    @Profile("EN-AU")
    @Bean
    I18nEnglishGreetingServiceWOImpl i18nService() {return new I18nEnglishGreetingServiceWOImpl();}

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishGreetingServiceWOImpl i18nSpanishGreetingServiceWO() {return new I18nSpanishGreetingServiceWOImpl();}
}
