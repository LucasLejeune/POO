package com.example;

public class Cat extends Animal {
    @Override
    public String animalScream() {
        return "Miaou";
    }

    @Override
    public String move() {
        return "4 pattes";
    }
}
