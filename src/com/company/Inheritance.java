package com.company;

public class Inheritance {

    int z;

    public Inheritance() {
    }

    public void add(int x, int y) {
        this.z = x + y;
        System.out.println("Addition " + this.z);
    }

    public void Sub(int x, int y) {
        this.z = x - y;
        System.out.println("Substraction " + this.z);
    }
}
