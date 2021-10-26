package com.letchlab.training.oops.abstraction;

/**
 * its hide implementation.
 * Data abstraction is the process to hiding certain details and showing only what is needed.
 * we use abstract keyword to define the class or method.
 * Abstract Class : is a restricted that can not be used to create objects(to access it , it must be inherited from
 * another class).
 *
 * Abstract Method : this method can only be in Abstract class and it doesn not contain the body.
 * Abstract class can both the methods Abstract and regular methods.
 *
 */
public class Main
{
    public static void main(String[] args) {

        School school = new School();
        school.setFirstName("Rakesh");
        school.setLastName("G");
        System.out.println(school.getFirstName());
        System.out.println(school.rollNumber());
        school.test();
        school.getTesting();

    }
}
