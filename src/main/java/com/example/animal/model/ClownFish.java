package com.example.animal.model;

public class ClownFish extends AnimalWithDetails implements SeaCreature {


    private final boolean makeJoke;

    public ClownFish(String size, String color, boolean makeJoke) {
        super(size, color);
        this.makeJoke = makeJoke;
    }

    @Override
    public boolean canSwim() {
        return true;
    }


    public boolean makeJoke() {
        return makeJoke;
    }
}
