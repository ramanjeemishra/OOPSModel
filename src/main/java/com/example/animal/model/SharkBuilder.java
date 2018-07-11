package com.example.animal.model;

public class SharkBuilder {
    private String size;
    private String color;
    private Animal eat;

    public SharkBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public SharkBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public SharkBuilder setEat(Animal eat) {
        this.eat = eat;
        return this;
    }

    public Shark createShark() {
        return new Shark(size, color, eat);
    }
}