package com.example.animal.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.animal.repository.AnimalRepository.getAnimals;
import static com.example.animal.repository.AnimalTestData.*;
import static com.example.animal.service.AnimalStatsService.count;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

	@DisplayName("Duck Model - Q2 a")
	@Test
	void duckCanSwimAndMakeSound() {
		Duck duck = makeDuck();
		assertAll("Duck can canSwim and make sound",
				() -> assertTrue(duck.canSwim()),
				() -> assertEquals(duckSound.sound(), duck.sing().sound()));
	}


	@DisplayName("Chicken Model - Q2 b")
	@Test
	void chickenCanMakeSound() {
		Chicken chicken = makeChicken();
		assertAll("Chicken can make sound but cant fly",
				() -> assertFalse(chicken.canFly()),
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
	void fishCanSwim() {
		Fish fish = makeFish();
		assertTrue(fish.canSwim());
	}

	@DisplayName("Model Clown Fish - Q B1, 2a")
	@Test
	void clownFishCanMakeJoke() {
		ClownFish clownFish = makeClownFish();
		assertAll("Shark Behavior Test",
				() -> assertTrue(clownFish.makeJoke()),
				() -> assertEquals("Orange", clownFish.getColor()));
	}

	@DisplayName("Model Shark - Q B1, 2a")
	@Test
	void sharkIsLargeAndGrey() {
		Shark shark = makeShark();
		assertAll("Shark Behavior Test",
				() -> assertNotNull(shark.eat()),
				() -> assertEquals("Grey", shark.getColor()));
	}

	@DisplayName("Counting animals")
	@Test
	void countAnimals() {
		Animal[] animals = getAnimals();

		assertAll("Count Animals with different predicates",
				() -> assertEquals(2, count(animals, Animal::canFly)),
				() -> assertEquals(1, count(animals, Animal::canWalk)),
				() -> assertEquals(1, count(animals, Animal::canSing)),
				() -> assertEquals(5, count(animals, Animal::canSwim))

		);
	}

}