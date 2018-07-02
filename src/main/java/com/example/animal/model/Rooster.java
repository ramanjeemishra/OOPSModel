package com.example.animal.model;

import com.example.animal.behaviour.SingingAnimal;
import com.example.animal.behaviour.Sound;

public class Rooster extends Bird implements SingingAnimal {

    private final Sound sound;


    private final Chicken relative;

    public Rooster(Sound sound, Chicken relative) {
        this.sound = sound;
        this.relative = relative;
    }

    public Rooster(Sound sound) {
        this.sound = sound;
        this.relative = null;
    }

    @Override
    public Sound sing() {
        return sound;
    }

    public Chicken getRelative() {
        return relative;
    }


}
