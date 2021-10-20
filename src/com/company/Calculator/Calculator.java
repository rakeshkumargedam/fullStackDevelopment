// simple calculator
//it calculate addition, substraction, Multiplication, Division, Squareroot, Suare, power.
package com.company.Calculator;

import java.util.Scanner;

public class Calculator {
    int z;

    public void add(int x, int y) {
        this.z = x + y;
        System.out.println("Addition: " + this.z);
    }

    public void Sub(int x, int y) {
            this.z = x - y;

        System.out.println("Substraction: " + this.z);

    }

    public void Multi(int x, int y) {
        this.z = x * y;
        System.out.println("Multiply : " + this.z);
    }

    public void Divi(int x, int y) {
        if(y<=0) {
            try {
                this.z = x / y;
                System.out.println(z);
            }
            catch(ArithmeticException ex){
                System.out.println("Not Possible");
            }
        }
        else
        this.z = x / y;
        System.out.println("Division: " + this.z);
    }

    public void Sqroot(float x) {
        /*if (x < 0) {
            try {
               this.z = (int) Math.sqrt(x);
                System.out.println( this.z);

            }
            catch (ArithmeticException ex) {
                System.out.println("negative value don't have real Square root" + ex.getMessage());
            }
        }
        else*/
            this.z = (int) Math.sqrt(x); //square root fuction accept only double value.

            System.out.println("Square root of x: " + this.z);


        }


        public void Square(int x, int y){
            this.z = x * x;
            this.z = y * y;
            System.out.println("Square of x: " + this.z);
            System.out.println("Square of y: " + this.z);
        }
        public void Power ( int x){
            System.out.println("Enter the Power of number: ");
            Scanner sc = new Scanner(System.in);
            double i = sc.nextInt();
            this.z = (int) Math.pow(i, x);
            System.out.printf("%f power of %d: ", i, x);
            System.out.print(z);
            System.out.println();

        }

    }

