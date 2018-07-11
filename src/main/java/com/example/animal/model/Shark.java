package com.example.animal.model;

import com.example.animal.behaviour.SwimmingAnimal;

public class Shark implements SwimmingAnimal {

    private final Animal eat;
    private final Characteristics characteristics;

    Shark(String size, String color, Animal eat) {
        characteristics = new Characteristics(size, color);
        this.eat = eat;
    }

    @Override
    public boolean canSwim() {
        return true;
    }

    public Animal eat() {
        return eat;
    }

    public String getSize() {
        return characteristics.getSize();
    }

    public String getColor() {
        return characteristics.getColor();
    }
}
