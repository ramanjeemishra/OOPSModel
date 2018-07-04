package com.example.animal.model;

import com.example.animal.behaviour.SwiminingAnimal;

public class Dolphin extends AnimalWithDetails implements SwiminingAnimal {
    public Dolphin(String color, String size) {
        super(color, size);
    }


    @Override
    public boolean swim() {
        return true;
    }
}
