package com.example;

public class Main {
    public static void main(String[] args) {
        Animal chat = AnimalFactory.createAnimal("Chat", "Felix");
        System.out.println("Animal crée: " + chat.getName());
        System.out.println(chat.animalScream());
    }
}