package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarOptions> options = new ArrayList<>();
        options.add(CarOptions.GPS);
        options.add(CarOptions.ToitOuvrant);
        CarBuilder carBuilder = new CarBuilder("DIESEL");
        carBuilder.setOptions(options);
        carBuilder.setCouleurExterieure("ROUGE");
        carBuilder.setCouleurInterieure("VERT");

        Car car = carBuilder.build();
        System.out.println(car.getMotorisation());
        System.out.println(car.getCouleurInterieure());
        System.out.println(car.getCouleurExterieure());
        System.out.println(car.getBoiteVitesses());
        System.out.println("Options:");
        for (CarOptions carOption : car.getOptions()) {
            System.out.println(carOption.getLabel());

        }
    }
}