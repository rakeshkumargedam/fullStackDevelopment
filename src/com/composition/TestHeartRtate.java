package com.composition;

public class TestHeartRtate {

    public static void main(String[] args) {
        Human h1 = new Human();
        Heart heart = new Heart();
        System.out.println(h1.getFunction());
        System.out.println(h1.getAge());
        System.out.println(h1.getHeartRate());
        System.out.println(h1.getGender());

    }
}