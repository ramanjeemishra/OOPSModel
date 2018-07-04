package com.example.animal.model;

import com.example.animal.behaviour.Animal;

public abstract class AnimalWithDetails implements Animal {
    String size;
    String color;

    public AnimalWithDetails(String size, String color) {
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
