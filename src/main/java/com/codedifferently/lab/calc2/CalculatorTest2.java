package com.codedifferently.lab.calc2;

public class CalculatorTest2 {
    public static void main(String[] args) {
        //Instantiate a Calculator2 object
        Calculator2 calc2 = new Calculator2();
        double[] beforeTotals = {10.0, 12.0, 9.0, 8.0, 7.0, 15.0, 11.0, 30.0};
        for (int i = 0; i < beforeTotals.length; i++) {
            calc2.originalPrice = beforeTotals[i];
            calc2.findTotal();
        }

        //Access the Calculator2 object's fields and methods
        //to find the total for each member of the birthday party


        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15 (Alex)
        Person 7: $11
        Person 8: $30
        */

    }
}
