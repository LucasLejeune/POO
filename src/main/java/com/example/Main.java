package com.example;

import main.java.com.example.Holding;
import main.java.com.example.Pizza;
import main.java.com.example.Restaurant;

public class Main {
    public static void main(String[] args) {
        Holding holding = new Holding();
        Restaurant pizzaYolo = new Restaurant();
        pizzaYolo.setAdresse("12 rue ici 59595 La");
        pizzaYolo.setStatusJuridique("SARL");
        pizzaYolo.setChiffreAffaires(20);
        pizzaYolo.setNombreSalaries(4);
        Pizza marguerita = new Pizza();
        marguerita.setName("Marguerita");
        marguerita.setPoids(230.5);
        marguerita.addIngredient("Tomate");
        marguerita.addIngredient("Mozzarella");
        marguerita.addIngredient("Origan");
        pizzaYolo.addPizza(marguerita);
        Pizza fromages = new Pizza();
        fromages.setName("99 fromages");
        fromages.setPoids(99.99);
        fromages.addIngredient("Fromage x 99");
        pizzaYolo.addPizza(fromages);
        Pizza gencives = new Pizza();
        gencives.setName("Gencives de porc et fromage Corse");
        gencives.setPoids(130);
        gencives.addIngredient("Gencives de porc");
        gencives.addIngredient("Fromage Corse");
        pizzaYolo.addPizza(gencives);

        holding.addRestaurant(pizzaYolo);

    }
}