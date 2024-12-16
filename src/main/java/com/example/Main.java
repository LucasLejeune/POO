package com.example;

import main.java.com.example.Cat;
import main.java.com.example.Chevalier;
import main.java.com.example.Dog;
import main.java.com.example.Duck;
import main.java.com.example.Troll;

public class Main {
    public static void main(String[] args) {
        Chevalier chevalier = new Chevalier();
        System.out.println("Personnage:" + chevalier.getName());
        System.out.println("PF:" + chevalier.getStrenght());
        System.out.println("PV:" + chevalier.getHealthPoints());
        System.out.println("-------------------------");
        System.out.println("     Leveling up !!!     ");
        System.out.println("-------------------------");
        chevalier.levelUp();
        System.out.println("PF:" + chevalier.getStrenght());
        System.out.println("PV:" + chevalier.getHealthPoints());
        chevalier.fight();
        Troll troll = new Troll();
        System.out.println("Personnage:" + troll.getName());
        System.out.println("PF:" + troll.getStrenght());
        System.out.println("PV:" + troll.getHealthPoints());
        System.out.println("-------------------------");
        System.out.println("     Leveling up !!!     ");
        System.out.println("-------------------------");
        troll.levelUp();
        System.out.println("PF:" + troll.getStrenght());
        System.out.println("PV:" + troll.getHealthPoints());
        troll.fight();
    }
}