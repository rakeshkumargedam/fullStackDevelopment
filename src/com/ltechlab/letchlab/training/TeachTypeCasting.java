package com.ltechlab.letchlab.training;

public class TeachTypeCasting
{
    public static void main(String[] args) {
        /**
         * Convert String into Integer
         * Convert int into double
         * Convert Double into float
         * Convert Integer into String
         */

        String inputNumber = "10a";
        System.out.println("Given String value is: " + inputNumber);

        try
        {
            int stringNumber = Integer.parseInt(inputNumber);
            System.out.println("Converted value from string to int is : " + stringNumber);
        } catch (NumberFormatException ex) {
            System.out.println("Given value is not an integer " + ex.getMessage());
        }
    }
}
