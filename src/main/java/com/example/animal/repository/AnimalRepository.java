package com.example.animal.repository;

import com.example.animal.behaviour.Animal;

import static com.example.animal.repository.AnimalTestData.*;

public class AnimalRepository {
    private AnimalRepository() {
    }

    public static Animal[] getAnimals() {
        return new Animal[]{
                makeDuck(),
                makeClownFish(),
                makeFish(),
                makeButterFly(),
                makeCaterPillar(),
                makeDolphin(),
                makeShark()
        };
    }
}
