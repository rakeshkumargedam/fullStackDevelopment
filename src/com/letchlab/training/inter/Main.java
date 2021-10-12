package com.letchlab.training.inter;

public class Main {
    public static void main(String[] args) {

        PowerPlantImpl pp =new PowerPlantImpl();
        pp.setTypeOfPowerPlant();
        System.out.println("Type Of Power Plant is " +pp.getTypeOfPowerPlant());
        pp.setPowerProduce();
        System.out.println("Power Produce is "+ pp.getPowerProduce());
        System.out.println("working");
    }
}

