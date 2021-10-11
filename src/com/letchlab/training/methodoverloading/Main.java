package com.letchlab.training.methodoverloading;

public class Main {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        calc.multiply(12,10);
        calc.multiply(12,10,15);
    }
}
