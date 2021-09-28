package com.letchlab.training.association.onetoone;

public class TestOneToOne {
    public static void main(String[] args) {
        Mobile m= new Mobile("NOKIA");
        Function f1 = new Function("calling");
        Function f2 = new Function("recording");
        Function f3 = new Function("MESSEGING");
        System.out.println("different function of " + m.getBrand()+ "is " + f1.getFunction());
        System.out.println("different function of " + m.getBrand()+ "is " + f2.getFunction());
        System.out.println("different function of " + m.getBrand()+ "is " + f3.getFunction());
    }
}
