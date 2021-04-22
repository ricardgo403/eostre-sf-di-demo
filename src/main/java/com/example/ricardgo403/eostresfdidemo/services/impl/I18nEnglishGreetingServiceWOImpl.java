package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.repositories.EnglishGreetingRepository;
import com.example.ricardgo403.eostresfdidemo.services.IGreetingService;

public class I18nEnglishGreetingServiceWOImpl implements IGreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingServiceWOImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return this.englishGreetingRepository.getGreeting();
    }
}
