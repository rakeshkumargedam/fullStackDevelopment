package com.letchlab.training.abstraction;

public class Main {
    public static void main(String[] args) {
        Led l = new Led();
        l.operation();
        l.setBrand("bajaj");
        l.setCost(100);
        System.out.print("the brand is " + l.getBrand()+ " and the cost is rupees "+ l.getCost());
    }
}

