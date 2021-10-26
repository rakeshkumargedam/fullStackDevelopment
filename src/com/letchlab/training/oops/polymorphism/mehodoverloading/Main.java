package com.letchlab.training.oops.polymorphism.mehodoverloading;

public class Main
{
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("Static");
        vehicle.run("Running", "Mercedese");
        vehicle.run(10);
    }
}
