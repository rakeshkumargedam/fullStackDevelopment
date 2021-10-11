package com.letchlab.training.methodoverloading;

public class Calculation {
    public void multiply(int a , int b){
        int c = a * b;
        System.out.println("multipication of two number is " + c);

    }
    public void multiply(int a , int b , int x){
        int z = a*b*x;
        System.out.println("multipication of two number is " + z);
    }
}

