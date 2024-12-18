package com.example;

public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static final Singleton getInstance() {
        return instance;
    }
}
