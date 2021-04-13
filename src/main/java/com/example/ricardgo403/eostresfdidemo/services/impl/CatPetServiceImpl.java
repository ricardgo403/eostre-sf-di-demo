package com.example.ricardgo403.eostresfdidemo.services.impl;

import com.example.ricardgo403.eostresfdidemo.services.IPetService;
import org.springframework.stereotype.Service;

@Service("cat")
public class CatPetServiceImpl implements IPetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
