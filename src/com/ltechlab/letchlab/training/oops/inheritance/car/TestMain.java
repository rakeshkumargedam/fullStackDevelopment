package com.ltechlab.letchlab.training.oops.inheritance.car;

public class TestMain
{

    public static void main(String[] args) {
        Car car = new Car();
        car.components();
        car.abs();
        car.getSteeringType("Power Steering");
        car.type("Petrol");

        Vehicle vehicle = new Vehicle();
        vehicle.typeOfVehicle("CAR");
        vehicle.type("Petrol");
        vehicle.abs();
        vehicle.getSteeringType("Manual");

        vehicle.typeOfVehicle("BUS");
        vehicle.type("DIESEL");
        vehicle.getSteeringType("POWER");
        vehicle.abs();
    }


}
