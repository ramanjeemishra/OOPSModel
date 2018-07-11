package com.example.animal.model;

public class ClownFish implements SeaCreature {

	private final boolean makeJoke;
	private final AnimalCharacteristic characteristic;

	public ClownFish(String size, String color, boolean makeJoke) {
		characteristic = new AnimalCharacteristic(size, color);
		this.makeJoke = makeJoke;
	}

	@Override
	public boolean canSwim() {
		return true;
	}


	public boolean makeJoke() {
		return makeJoke;
	}

	public String getSize() {
		return characteristic.getSize();
	}

	public String getColor() {
		return characteristic.getColor();
	}
}
