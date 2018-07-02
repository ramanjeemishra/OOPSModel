package com.example.animal.model;

public abstract class AnimalWithBehaviourDetails  extends Animal{
    String size;
    String color;

    public AnimalWithBehaviourDetails(String colr, String size) {
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
