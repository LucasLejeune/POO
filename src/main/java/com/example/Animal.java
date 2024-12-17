package com.example;

public abstract class Animal {
    private String name;

    public Animal() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String animalScream();

    public abstract String move();

}
