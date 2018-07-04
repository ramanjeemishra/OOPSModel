package com.example.animal.service;

import com.example.animal.behaviour.Animal;

import java.util.function.Predicate;

import static java.util.Arrays.stream;

public class AnimalStatsService {
    private AnimalStatsService() {
    }

    public static long count(final Animal[] animalBehaviours, final Predicate<Animal> predicate) {
        return stream(animalBehaviours).filter(predicate).count();
    }
}
