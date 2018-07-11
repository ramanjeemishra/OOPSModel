package com.example.animal.model;

public class Dolphin implements SeaCreature {
    private final Characteristics characteristics;

    public Dolphin(String color, String size) {
        characteristics = new Characteristics(color, size);
    }


    @Override
    public boolean canSwim() {
        return true;
    }
}
