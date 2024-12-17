package com.example;

import java.util.ArrayList;

public class Car {
    private String motorisation;
    private int nombreSieges = 4;
    private String couleurInterieure;
    private String couleurExterieure;
    private String boiteVitesses = "BVM";
    private int tailleJantes = 15;
    private ArrayList<CarOptions> options;

    public Car(String motorisation) {
        this.motorisation = motorisation;
        if (this.motorisation == "DIESEL") {
            this.couleurInterieure = "NOIR";
            this.couleurExterieure = "NOIR";
        } else {
            this.tailleJantes = 16;
            this.boiteVitesses = "BVA";
        }
    }

    public Car avecNombreSieges(int nombreSieges) {
        this.nombreSieges = nombreSieges;
        return this;
    }

    public Car avecCouleurInterieure(String couleur) {
        this.couleurInterieure = couleur;
        return this;
    }

    public Car avecCouleurExterieure(String couleur) {
        this.couleurExterieure = couleur;
        return this;
    }

    public Car avecBoiteVitesses(String boiteVitesses) {
        this.boiteVitesses = boiteVitesses;
        return this;
    }

    public Car avecTailleJantes(int tailleJantes) {
        this.tailleJantes = tailleJantes;
        return this;
    }

    public Car avecOptions(ArrayList<CarOptions> options) {
        this.options = options;
        return this;
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
