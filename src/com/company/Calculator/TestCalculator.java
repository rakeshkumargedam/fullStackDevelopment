package com.company.Calculator;

public class TestCalculator {

    public static void main(String[] args) {
        System.out.println("Enter the Angle:");
        ScintificCalculator calci = new ScintificCalculator();

        System.out.println("Value of Sin Function: " + calci.Sin);
        System.out.println("Value of Cos Function: " + calci.Cos);
        System.out.println("Value of Tan Function: " + calci.Tan);
        calci.add(45,78);
        calci.Sub(78,23);
        calci.Multi(45,23);
        calci.Divi(78,6);
        calci.Factoria(45);
        calci.Sqroot(45, 56);
        calci.Power(23);
        calci.Percentage();



    }
}