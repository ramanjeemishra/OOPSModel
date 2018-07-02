package com.example.animal.model;

import com.example.animal.behaviour.SwiminingAnimal;

public class Shark extends AnimalWithBehaviourDetails implements SwiminingAnimal {

    private final Animal eat;

    public Shark(String size, String color, Animal eat) {
        super(size, color);
        this.eat = eat;
    }

    @Override
    public boolean swim() {
        return true;
    }
}
