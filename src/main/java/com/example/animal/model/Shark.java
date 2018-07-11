package com.example.animal.model;

import com.example.animal.behaviour.SwimmingAnimal;

public class Shark implements SwimmingAnimal {

    private final Animal eat;
    private final AnimalCharacteristic characteristic;

    Shark(String size, String color, Animal eat) {
        characteristic = new AnimalCharacteristic(size, color);
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
        return characteristic.getSize();
    }

    public String getColor() {
        return characteristic.getColor();
    }
}
