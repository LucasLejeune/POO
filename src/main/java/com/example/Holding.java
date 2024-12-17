package com.example;

import java.util.ArrayList;

public class Holding {
    private String adresse;
    private String statusJuridique;
    private double chiffreAffaires;
    private int nombreSalaries;
    private ArrayList<Restaurant> restaurants;

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getStatusJuridique() {
        return this.statusJuridique;
    }

    public void setStatusJuridique(String statusJuridique) {
        this.statusJuridique = statusJuridique;
    }

    public double getChiffreAffaires() {
        return this.chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public int getNombreSalaries() {
        return this.nombreSalaries;
    }

    public void setNombreSalaries(int nombreSalaries) {
        this.nombreSalaries = nombreSalaries;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return this.restaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
    }
}
