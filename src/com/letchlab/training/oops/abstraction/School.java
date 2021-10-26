package com.letchlab.training.oops.abstraction;

public class School extends Student
{

    @Override public void test()
    {
        System.out.println("Testing the abstract method");

    }

    @Override public int rollNumber()
    {
        return 12345;
    }
}
