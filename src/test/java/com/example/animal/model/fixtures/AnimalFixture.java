package com.example.animal.model.fixtures;

import com.example.animal.behaviour.Sound;
import com.example.animal.model.Chicken;
import com.example.animal.model.Duck;

public class AnimalFixture {
    private AnimalFixture() {
    }

    public static Sound duckSound = () -> "Quack, Quack";
    public static Sound chickenSound = () -> "Cluck, cluck";


    public static Duck makeDuck() {
        return new Duck(duckSound);
    }

    public static Chicken makeChicken() {
        return new Chicken(chickenSound);
    }
}
