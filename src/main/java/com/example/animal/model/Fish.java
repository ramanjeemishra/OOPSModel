package com.example.animal.model;

import com.example.animal.behaviour.Animal;
import com.example.animal.behaviour.SwiminingAnimal;

public class Fish implements SwiminingAnimal, Animal {
    @Override
    public boolean swim() {
        return true;
    }
}
