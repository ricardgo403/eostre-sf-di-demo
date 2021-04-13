package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IPetService;
import org.springframework.context.annotation.Profile;

@Profile({"dog", "default"})
public class DogPetServiceImpl implements IPetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
