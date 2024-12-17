package com.example;

public class Main {
    public static void main(String[] args) {
        Animal chat = AnimalFactory.createAnimal("Chat", "Felix");
        System.out.println("Animal crée: " + chat.getName());
        System.out.println(chat.animalScream());

        Animal chien = AnimalFactory.createAnimal("Chien", "Maurice");
        System.out.println("Animal crée: " + chien.getName());
        System.out.println(chien.animalScream());

        Animal canard = AnimalFactory.createAnimal("Canard", "Louis");
        System.out.println("Animal crée: " + canard.getName());
        System.out.println(canard.animalScream());
    }
}