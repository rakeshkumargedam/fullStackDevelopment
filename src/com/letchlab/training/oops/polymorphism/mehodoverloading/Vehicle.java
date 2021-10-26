package com.letchlab.training.oops.polymorphism.mehodoverloading;

public class Vehicle
{
    public void run (String vehicleStatus) {

        System.out.println("Vehicle status is : " + vehicleStatus);
    }
    public void run (String vehicleStatus,String vehicleName) {

        System.out.println("Vehicle status of : "  + vehicleName + " is " + vehicleStatus);
    }

    public void run (int vehicleNumbers) {

        System.out.println("Total vehicle is  : "  + vehicleNumbers);
    }

    public void run (int vehicleNumbers,String vehicleName) {

        System.out.println("Total vehicle is  : "  + vehicleNumbers + " and name is  " + vehicleName);
    }

    public void run (String vehicleName,int vehicleNumbers) {

        System.out.println("Total vehicle is  : "  + vehicleNumbers + " and name is  " + vehicleName);
    }
}
