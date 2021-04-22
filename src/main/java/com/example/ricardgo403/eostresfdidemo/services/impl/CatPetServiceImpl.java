package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IPetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("cat")
//@Service
public class CatPetServiceImpl implements IPetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
