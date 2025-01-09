package com.codedifferently.lab.calc4;

public class Calculator4 {
    public double tax = .05;
    public double tip = .15;
    double tableTotal = 0;
    int count = 0;

    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name){
        count += 1;
        double total = price * (1 + tax + tip);
        tableTotal += total;
        System.out.println(name + ": $" + total);
        System.out.println("Table Total: " + tableTotal);
        if (count > 6) {
            count -= 2;
        }
        System.out.println("Split Bill: " + (tableTotal / count));
    }
}
