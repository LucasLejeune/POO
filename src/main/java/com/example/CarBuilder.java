package com.example;

import java.util.ArrayList;

public class CarBuilder {

    private String motorisation;
    private int nombreSieges = 4;
    private String couleurInterieure;
    private String couleurExterieure;
    private String boiteVitesses = "BVM";
    private int tailleJantes = 15;
    private ArrayList<CarOptions> options;

    public CarBuilder(String motorisation) {
        this.motorisation = motorisation;
    }

    public String getMotorisation() {
        return motorisation;
    }

    public int getNombreSieges() {
        return nombreSieges;
    }

    public String getCouleurInterieure() {
        return couleurInterieure;
    }

    public String getCouleurExterieure() {
        return couleurExterieure;
    }

    public String getBoiteVitesses() {
        return boiteVitesses;
    }

    public int getTailleJantes() {
        return tailleJantes;
    }

    public ArrayList<CarOptions> getOptions() {
        return options;
    }

    public void setMotorisation(String motorisation) {
        this.motorisation = motorisation;
    }

    public void setNombreSieges(int nombreSieges) {
        this.nombreSieges = nombreSieges;
    }

    public void setCouleurInterieure(String couleurInterieure) {
        this.couleurInterieure = couleurInterieure;
    }

    public void setCouleurExterieure(String couleurExterieure) {
        this.couleurExterieure = couleurExterieure;
    }

    public void setBoiteVitesses(String boiteVitesses) {
        this.boiteVitesses = boiteVitesses;
    }

    public void setTailleJantes(int tailleJantes) {
        this.tailleJantes = tailleJantes;
    }

    public void setOptions(ArrayList<CarOptions> options) {
        this.options = options;
    }

    public Car build() {
        if (this.motorisation == "DIESEL") {
            this.couleurInterieure = "NOIR";
            this.couleurExterieure = "NOIR";
        } else {
            this.tailleJantes = 16;
            this.boiteVitesses = "BVA";
        }
        return new Car(this);
    }

}
