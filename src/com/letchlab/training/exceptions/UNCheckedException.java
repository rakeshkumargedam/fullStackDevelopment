package com.letchlab.training.exceptions;

/**
 * Exceptions is an unwanted event during the execution of program.
 * exceptions are two types :
 * 1. Checked Exceptions ---> IO or Compile time exception.You can not have throw new exceptions in catch block
 * instead you throws in method signature.
 * 3. Un-checked Exceptions ---> Runtime or null pointer exceptions. We use throw new Exceptions.
 *
 * throws, try catch with throw new
 */
public class UNCheckedException
{
    public static void main(String [] args) {
        int a = 0;
        int b = 20;
        //int c = b/a;
        String d = null;
        //System.out.println(d.length());

/*
        if (d != null) {
            throw new CustomNullPointer("Given String is null provided by main program");
        }
        try {
            int length = d.length();
        } catch (CustomNullPointer ex) {
            System.out.println(ex.getMessage());
            throw new CustomNullPointer("Given String is null provided by main program");
            //System.out.println("Given value of String is null");
        }
*/

        /*if (a == 0) {
            throw new CustomNullPointer("Given value of a is 0");
        }*/
       try {
               int c = b / a;
        } catch (ArithmeticException ex) {
           //System.out.println(ex.getMessage());
           throw new ArithmeticException(ex.getMessage());
            //System.out.println(" Error: Number is divided " + ex.getMessage());
        }
       finally
       {
           System.out.println("Proceeding with next step !!");
       }

        //System.out.println("Proceeding with next step !!");
    }
}
