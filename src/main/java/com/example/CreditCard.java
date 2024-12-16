package main.java.com.example;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount, BankAccount source, BankAccount destination) {
        System.out.println(String.format("credit card with amount %s from %s to %s", amount, source, destination));
    }
}
