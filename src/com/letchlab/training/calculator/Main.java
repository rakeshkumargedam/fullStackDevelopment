package com.letchlab.training.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1;
        double num2;
        int symbol;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = sc.nextDouble();
        System.out.println("enter second number");
        num2 = sc.nextDouble();
        System.out.println("1 for + , 2 for - , 3 for * , 4 for /");
        symbol = sc.nextInt();
        if(symbol==1){
            System.out.println("addition = " + (num1+num2));
        }
        else if (symbol==2){
            System.out.println("substraction = "+(num1-num2) );
        }
        else if (symbol==3){
            System.out.println("multiplication = "+(num1*num2) );
        }
        else if (symbol==4){
            System.out.println("division = "+(num1/num2) );
            if(num2 == 0){
                System.out.println("undefined");
            }

        }




    }

    }

