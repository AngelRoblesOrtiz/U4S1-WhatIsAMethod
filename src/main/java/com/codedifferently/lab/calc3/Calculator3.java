package com.codedifferently.lab.calc3;

public class Calculator3 {
    public void findTotal(double price, double tax, double tip, String name) {
        double total = price * tip;
        total *= tax;
        total = Math.round(total * 100.0) / 100.0;
        System.out.println(name + " total: $" + total);

    }
}
