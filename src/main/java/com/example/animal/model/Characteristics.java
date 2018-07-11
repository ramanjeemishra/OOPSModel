package com.example.animal.model;

final class Characteristics {
	String size;
	String color;

	Characteristics(String size, String color) {
		this.size = size;
		this.color = color;
	}

	String getSize() {
		return size;
	}

	String getColor() {
		return color;
	}
}
