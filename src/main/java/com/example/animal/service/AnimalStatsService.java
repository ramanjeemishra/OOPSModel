package com.example.animal.service;

import com.example.animal.model.Animal;

import static java.util.Arrays.stream;

import java.util.function.Predicate;

public class AnimalStatsService {
    private AnimalStatsService() {
    }

    public static long count(final Animal[] animals, final Predicate<Animal> predicate) {
        return stream(animals).filter(predicate).count();
    }
}
