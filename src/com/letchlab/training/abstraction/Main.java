package com.letchlab.training.abstraction;

public class Main {
    public static void main(String[] args) {
        String battery = null;

        try
        {
            int length = battery.length();
        }
        catch (NullPointerException ex){
            //throw new NullPointerException();

            System.out.println("please insert the battery");
        }
        //Led l = new Led();
        //l.operation();
        //l.setBrand("bajaj");
        //l.setCost(100);
        //System.out.print("the brand is " + l.getBrand()+ " and the cost is rupees "+ l.getCost());
    }
}

