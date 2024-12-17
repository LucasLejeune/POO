package com.example;

import java.util.ArrayList;

public class Car {
    private String motorisation;
    private int nombreSieges;
    private String couleurInterieure;
    private String couleurExterieure;
    private String boiteVitesses;
    private int tailleJantes;
    private ArrayList<CarOptions> options;

    public Car(CarBuilder carBuilder) {
        this.boiteVitesses = carBuilder.getBoiteVitesses();
        this.couleurExterieure = carBuilder.getCouleurExterieure();
        this.couleurInterieure = carBuilder.getCouleurInterieure();
        this.motorisation = carBuilder.getMotorisation();
        this.nombreSieges = carBuilder.getNombreSieges();
        this.options = carBuilder.getOptions();
        this.tailleJantes = carBuilder.getTailleJantes();
    }

    public String getMotorisation() {
        return this.motorisation;
    }

    public int getNombreSieges() {
        return this.nombreSieges;
    }

    public String getCouleurInterieure() {
        return this.couleurInterieure;
    }

    public String getCouleurExterieure() {
        return this.couleurExterieure;
    }

    public String getBoiteVitesses() {
        return this.boiteVitesses;
    }

    public int getTailleJantes() {
        return this.tailleJantes;
    }

    public ArrayList<CarOptions> getOptions() {
        return this.options;
    }

}
