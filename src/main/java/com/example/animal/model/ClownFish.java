package com.example.animal.model;

public class ClownFish implements SeaCreature {

	private final boolean makeJoke;
	private final Characteristics characteristics;

	public ClownFish(String size, String color, boolean makeJoke) {
		characteristics = new Characteristics(size, color);
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
		return characteristics.getSize();
	}

	public String getColor() {
		return characteristics.getColor();
	}
}
