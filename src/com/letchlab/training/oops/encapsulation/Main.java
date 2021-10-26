package com.letchlab.training.oops.encapsulation;

/**
 * Hiding sensitive data from users.
 * 1. java object --> Bean
 * Those objects are define with private access modifier.
 * two types of encapsulation 1. Read Only 2. Write Only
 * getter(Read Only) and setter (Write Only)
 *
 * 1. We have better control of class Attributes.
 * 2. Read-only (Using get method).
 * 3. Write-only (Using set method).
 * 4. Increase the security of data.
 */
public class Main
{

    public static void main(String[] args) {
        Student student = new Student();
        //student.setFirstName("Rakesh");
    }
}
