package com.letchlab.training.oops.interfaceoop;

public class School implements Student
{
    private String firstName;

    @Override public void setFirstName()
    {
        firstName = "Rakesh";
    }

    @Override public String getFirstName()
    {
        return firstName;
    }

    @Override public String getTesting()
    {
        return null;
    }

    @Override public void getInheritance()
    {

    }
}
