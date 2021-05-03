package com.example.ricardgo403.eostresfdidemo.configs;

import com.example.ricardgo403.eostresfdidemo.datasources.FakeDataSource;
import com.example.ricardgo403.eostresfdidemo.repositories.EnglishGreetingRepository;
import com.example.ricardgo403.eostresfdidemo.repositories.impl.EnglishGreetingRepositoryImpl;
import com.example.ricardgo403.eostresfdidemo.services.IPetService;
import com.example.ricardgo403.eostresfdidemo.services.PetServiceFactory;
import com.example.ricardgo403.eostresfdidemo.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/20/21
 ***/
//@PropertySource("classpath:datasource.properties")
//@ImportResource("classpath:didemoproject-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(SfgConfig sfgConfig) {
        var fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(sfgConfig.getUsername());
        fakeDataSource.setPassword(sfgConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfig.getJdbcUrl());
        return fakeDataSource;
    }

    @Bean
    PetServiceFactory petServiceFactory(){
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    IPetService dogPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean
    IPetService catPetService(PetServiceFactory petServiceFactory){
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

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
    I18nEnglishGreetingServiceWOImpl i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingServiceWOImpl(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean("i18nService")
    I18nSpanishGreetingServiceWOImpl i18nSpanishGreetingServiceWO() {return new I18nSpanishGreetingServiceWOImpl();}
}
