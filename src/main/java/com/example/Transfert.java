package com.example;

public class Transfert implements Payment {
    @Override
    public void pay(double amount, BankAccount source, BankAccount destination) {
        System.out.println(String.format("transfert amount %s from %s to %s", amount, source, destination));
    }
}
