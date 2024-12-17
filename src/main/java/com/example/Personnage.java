package com.example;

public abstract class Personnage {
    private String name;
    private int healthPoints;
    private int strenght;
    private weapons weapon;

    protected enum weapons {
        MASSUE, EPEE;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrenght() {
        return this.strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public weapons getWeapon() {
        return this.weapon;
    }

    public void setWeapon(weapons weapon) {
        this.weapon = weapon;
    }

    public void levelUp() {
        this.healthPoints++;
        this.strenght++;
    }

    public void fight() {
        System.out.println("Attaque avec " + this.getWeapon() + " !");
    }
}
