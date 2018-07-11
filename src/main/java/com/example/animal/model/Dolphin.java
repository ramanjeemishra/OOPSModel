package com.example.animal.model;

public class Dolphin extends AnimalWithDetails implements SeaCreature {
    public Dolphin(String color, String size) {
        super(color, size);
    }


    @Override
    public boolean canSwim() {
        return true;
    }
}
