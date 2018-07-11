package com.example.animal.model;

import com.example.animal.behaviour.SwimmingAnimal;

public class Shark extends AnimalWithDetails implements SwimmingAnimal, Animal {

    private final Animal eat;

    Shark(String size, String color, Animal eat) {
        super(size, color);
        this.eat = eat;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    public Animal eat() {
        return eat;
    }

}
