package com.codedifferently.lab.calc2;

public class Calculator2 {
    public double tax = 1.05;
    public double tip = 1.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;

    public void findTotal(){
        originalPrice *= tax;
        originalPrice *= tip;
        double finalTotal = Math.round(originalPrice * 100.0) / 100.0;
        System.out.println("Final total is: $" + finalTotal);
    }
}
