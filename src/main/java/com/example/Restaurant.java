package main.java.com.example;

import java.util.ArrayList;
import java.util.Collection;

public class Restaurant extends Holding {
    private String adresse;
    private String statusJuridique;
    private int nombreSalaries = 0;
    private double chiffreAffaires = 0;
    private ArrayList<Pizza> pizzas;

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

    public int getNombreSalaries() {
        return this.nombreSalaries;
    }

    public void setNombreSalaries(int nombreSalaries) {
        int newNombreSalaries = super.getNombreSalaries() - this.nombreSalaries + nombreSalaries;
        super.setNombreSalaries(newNombreSalaries);
        this.nombreSalaries = nombreSalaries;
    }

    public double getChiffreAffaires() {
        return this.chiffreAffaires;
    }

    public void setChiffreAffaires(double chiffreAffaires) {
        double newChiffreAffaires = super.getChiffreAffaires() - this.chiffreAffaires + chiffreAffaires;
        super.setChiffreAffaires(newChiffreAffaires);
        this.chiffreAffaires = chiffreAffaires;
    }

    public ArrayList<Pizza> getPizzas() {
        return this.pizzas;
    }

    public void addPizza(Pizza pizza) {
        this.pizzas.add(pizza);
    }
}