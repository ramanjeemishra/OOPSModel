package com.example.animal.model;

public class Dolphin implements SeaCreature {
    private final AnimalCharacteristic characteristic;

    public Dolphin(String color, String size) {
        characteristic = new AnimalCharacteristic(color, size);
    }


    @Override
    public boolean canSwim() {
        return true;
    }
}
