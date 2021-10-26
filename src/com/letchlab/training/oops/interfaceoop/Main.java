package com.letchlab.training.oops.interfaceoop;

/**
 * interface is a another way to implement Abstraction.
 * we use interface keyword to define the interface.
 * We use implement the interface.
 */
public class Main
{

    public static void main(String [] args) {
        School student = new School();
        student.setFirstName();
        System.out.println(student.getFirstName());
    }
}
