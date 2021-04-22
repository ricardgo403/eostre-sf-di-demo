package com.example.ricardgo403.eostresfdidemo.services;

import com.example.ricardgo403.eostresfdidemo.services.impl.CatPetServiceImpl;
import com.example.ricardgo403.eostresfdidemo.services.impl.DogPetServiceImpl;

/***
 * @author Copyright 2021 @ricardgo403., All Rights Reserved.
 * Created on 4/22/21
 ***/
public class PetServiceFactory {
    public IPetService getPetService(String petType){
        switch (petType) {
            case "dog":
                return new DogPetServiceImpl();
            case "cat":
                return new CatPetServiceImpl();
            default:
                return new DogPetServiceImpl();
        }
    }
}
