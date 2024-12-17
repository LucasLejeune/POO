package com.example;

public class Magicien extends Personnage {
    public Magicien() {
        super.setName("Magicien");
        super.setHealthPoints(15);
        super.setStrenght(3);
        super.setWeapon(weapons.EPEE);
    }
}
