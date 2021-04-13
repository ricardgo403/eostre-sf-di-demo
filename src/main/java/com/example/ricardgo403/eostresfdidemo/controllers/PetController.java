package com.example.ricardgo403.eostresfdidemo.controllers;

import com.example.ricardgo403.eostresfdidemo.services.IPetService;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {
    private final IPetService petService;

    public PetController(IPetService petService) {
        this.petService = petService;
    }

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
