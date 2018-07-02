package com.example.animal.model;

import com.example.animal.behaviour.SwiminingAnimal;

public class Fish extends Animal implements SwiminingAnimal {
    @Override
    public boolean swim() {
        return true;
    }
}
