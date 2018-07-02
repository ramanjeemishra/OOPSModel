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


    @DisplayName("Rooster Model - Q3")
    @Test
    void roosterCanMakeSound() {
        Rooster rooster = makeRooster();
        assertAll("Rooster can make sound",
                () -> assertEquals(roosterSound, rooster.sing()),
                () -> assertNotNull(rooster.getRelative()));
    }


    @DisplayName("Parrot Model - Q4")
    @Test
    void parrotCanAdaptSoundsFromOtherSound() {
        Parrot parrotWithDog = makeParrotLivingWithDog();
        Parrot parrotWithCat = makeParrotLivingWithCat();
        Parrot parrotWithDuck = makeParrotLivingWithDuck();
        Parrot parrotWithRooster = makeParrotLivingWithRooster();
        Parrot parrotWithPhone = makeParrotLivingWithPhone();
        assertAll("Adaptable sound birds",
                () -> assertEquals(dogSound, parrotWithDog.sing()),
                () -> assertEquals(catSound, parrotWithCat.sing()),
                () -> assertEquals(duckSound, parrotWithDuck.sing()),
                () -> assertEquals(roosterSound, parrotWithRooster.sing()),
                () -> assertEquals(phoneSound, parrotWithPhone.sing())
        );

    }

    @DisplayName("Model Fish - Q B1, 2a")
    @Test
    void fishCanSwim(){
        Fish fish = makeFish();
        assertTrue(fish.swim());
    }

    @DisplayName("Model Fish - Q B1, 2a")
    @Test
    void clownFishCanMakeJoke(){
        ClownFish clownFish = makeClownFish();
        assertTrue(clownFish.makeJoke());
    }
}