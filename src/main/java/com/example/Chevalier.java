package com.example;

public class Chevalier extends Personnage {
    public Chevalier() {
        super.setName("Chevalier");
        super.setHealthPoints(10);
        super.setStrenght(8);
        super.setWeapon(weapons.EPEE);
    }

}
