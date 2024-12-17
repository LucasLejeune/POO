package com.example;

public class AnimalFactory {
    public static Animal createAnimal(String type, String name) {
        if ("Chat".equalsIgnoreCase(type)) {
            return new Cat(name);
        }
        throw new IllegalArgumentException("Cet animal n'est pas paramétré");
    }
}
