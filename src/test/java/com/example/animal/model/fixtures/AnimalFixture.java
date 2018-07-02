package com.example.animal.model.fixtures;

import com.example.animal.behaviour.Sound;
import com.example.animal.model.*;

public class AnimalFixture {
    private AnimalFixture() {
    }

    public static Sound duckSound = () -> "Quack, Quack";
    public static Sound chickenSound = () -> "Cluck, cluck";
    public static Sound roosterSound = () -> "Cock-a-doodle-doo";
    public static Sound dogSound = () -> "Woof-woof";
    public static Sound catSound = () -> "Meow";
    public static Sound phoneSound = () -> "Tring-tring";


    public static Duck makeDuck() {
        return new Duck(duckSound);
    }

    public static Chicken makeChicken() {
        return new Chicken(chickenSound);
    }

    public static Rooster makeRooster() {
        return new Rooster(roosterSound, makeChicken());
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

    public static Fish makeFish() {
        return new Fish();
    }

    public static Shark makeShark() {
        return new Shark("Large", "Grey", makeFish());
    }

    public static ClownFish makeClownFish(){
        return new ClownFish("Small", "Orange", true);
    }
}
