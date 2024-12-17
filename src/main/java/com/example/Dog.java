package com.example;

public class Dog extends Animal {
    @Override
    public String animalScream() {
        return "Wouf";
    }

    @Override
    public String move() {
        return "4 pattes";
    }
}
