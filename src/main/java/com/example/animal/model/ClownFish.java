package com.example.animal.model;

import com.example.animal.behaviour.SwiminingAnimal;

public class ClownFish extends AnimalWithDetails implements SwiminingAnimal {


    private final boolean makeJoke;

    public ClownFish(String size, String color, boolean makeJoke) {
        super(size, color);
        this.makeJoke = makeJoke;
    }

    @Override
    public boolean swim() {
        return true;
    }


    public boolean makeJoke() {
        return makeJoke;
    }
}
