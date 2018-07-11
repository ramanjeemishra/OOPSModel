package com.example.animal.repository;

import com.example.animal.model.*;
import com.example.common.behaviour.Sound;

public class AnimalTestData {
    public static Sound duckSound = () -> "Quack, Quack";
    public static Sound chickenSound = () -> "Cluck, cluck";
    public static Sound roosterSound = () -> "Cock-a-doodle-doo";
    public static Sound dogSound = () -> "Woof-woof";
    public static Sound catSound = () -> "Meow";
    public static Sound phoneSound = () -> "Tring-tring";

    private AnimalTestData() {
    }

    public static Duck makeDuck() {
        return new Duck(duckSound);
    }

    public static Rooster makeRooster() {
        return new Rooster(roosterSound, makeChicken());
    }

    public static Chicken makeChicken() {
        return new Chicken(chickenSound);
    }

    public static Parrot makeParrotLivingWithDog() {
        return new Parrot(dogSound);
    }

    public static Parrot makeParrotLivingWithCat() {
        return new Parrot(catSound);
    }


    public static Parrot makeParrotLivingWithRooster() {
        return new Parrot(roosterSound);
    }

    public static Parrot makeParrotLivingWithDuck() {
        return new Parrot(duckSound);
    }

    public static Parrot makeParrotLivingWithPhone() {
        return new Parrot(phoneSound);
    }

    public static Shark makeShark() {
        return new SharkBuilder().setSize("Large").setColor("Grey").setEat(makeFish()).createShark();
    }

    public static Fish makeFish() {
        return new Fish();
    }

    public static ClownFish makeClownFish() {
        return new ClownFish("Small", "Orange", true);
    }

    public static ButterFly makeButterFly() {
        return new ButterFly();
    }

    public static CaterPillar makeCaterPillar() {
        return new CaterPillar();
    }

    public static Dolphin makeDolphin() {
        return new Dolphin("Medium", "Grey");
    }
}
