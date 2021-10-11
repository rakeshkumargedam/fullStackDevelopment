package com.letchlab.training.polymorphism;

public class Main {

    public static void main(String[] args) {
        Ministry m = new Ministry();
        Ministry railMinister = new Railway();
        Ministry defenceMinister = new Defence();
        m.minister();
        railMinister.minister();
        m.minister();
        defenceMinister.minister();
    }
}
