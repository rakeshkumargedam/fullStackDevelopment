// Scientific calculator calculates -
// Trignometric fuctions, factorial, percentage

package com.company.Calculator;

import java.util.Scanner;

public class ScintificCalculator extends Calculator {

    Scanner sc = new Scanner(System.in);
    double a = sc.nextInt();
    double Sin =  Math.sin(a); // Sin fuction accept degree value hence its need to cast into double.
    double Cos =  Math.cos(a);
    double Tan =  Math.tan(a);

    public void Factoria(double a){
        double fact=1;
        int i;
        for(i=1; i<=a; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of a is :"+ fact);
    }


    public void Percentage(){
        System.out.println("Enter Percent value: ");
        Scanner sc = new Scanner(System.in);
        float P = sc.nextInt();
        System.out.println("Enter the Value:");
        float V = sc.nextInt();
        float Percentage = (P/100)*V;
        System.out.printf("%.2f of %.2f is:", P, V);
        System.out.println(Percentage+"%");


    }






}
