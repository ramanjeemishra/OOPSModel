package com.example.animal.model;

import static com.example.animal.model.fixtures.AnimalFixture.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.animal.model.fixtures.AnimalFixture.makeDuck;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @DisplayName("Duck Model - Q2 a")
    @Test
    void duckCanSwimAndMakeSound() {
        Duck duck = makeDuck();
        assertAll("Duck can swim and make sound",
                () -> assertTrue(duck.swim()),
                () -> assertEquals(duckSound, duck.sing()));
    }


    @DisplayName("Chicken Model - Q2 b")
    @Test
    void chickenCanMakeSound() {
        Chicken chicken = makeChicken();
        assertAll("Chicken can make sound but cant fly",
                () -> assertFalse(chicken.fly()),
                () -> assertEquals(chickenSound, chicken.sing()));
    }

}