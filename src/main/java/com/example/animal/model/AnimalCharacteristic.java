package com.example.animal.model;

final class AnimalCharacteristic {
	String size;
	String color;

	public AnimalCharacteristic(String size, String color) {
		this.size = size;
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public String getColor() {
		return color;
	}
}
