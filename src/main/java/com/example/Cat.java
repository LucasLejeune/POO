package com.example;

public class Cat extends Animal {
    public Cat(String name) {
        super.setName(name);
    }

    @Override
    public String animalScream() {
        return "Miaou";
    }

    @Override
    public String move() {
        return "4 pattes";
    }
}
