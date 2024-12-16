package com.example;

import main.java.com.example.Cat;
import main.java.com.example.Dog;
import main.java.com.example.Duck;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();

        System.out.println(dog.animalScream() + " " + dog.move());
        System.out.println(cat.animalScream() + " " + cat.move());
        System.out.println(duck.animalScream() + " " + duck.move());
    }
}