package com.codedifferently.lab.tip;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)

        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        double[] beforeTotals = {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};
        for (int i = 0; i < beforeTotals.length; i++) {
            beforeTotals[i] *= 1.05;
            beforeTotals[i] *= 1.15;
            double finalTotal = Math.round(beforeTotals[i] * 100.0) / 100.0;
            System.out.println("Person " + (i + 1) + ": $" + finalTotal);
        }

    }
}
