package com.example.animal.model;

import com.example.animal.behaviour.FlyingAnimal;
import com.example.animal.behaviour.SingingAnimal;
import com.example.common.behaviour.Sound;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Chicken implements SingingAnimal, FlyingAnimal, Bird {

    @JsonProperty
    private Sound sound;

    public Chicken(Sound sound) {
        this.sound = sound;
    }

    @Override
    public Sound sing() {
        return sound;
    }

    @Override
    public boolean fly() {
        return false;
    }
}
