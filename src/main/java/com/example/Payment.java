package main.java.com.example;

public interface Payment {
    void pay(double amount, BankAccount source, BankAccount destination);
}
