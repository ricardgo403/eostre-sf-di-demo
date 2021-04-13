package com.example.ricardgo403.eostresfdidemo.controllers;

public class PetController {
    private final PetService petService;

    public String whichPetIsTheBest() {
        return petService.getPetType();
    }
}
