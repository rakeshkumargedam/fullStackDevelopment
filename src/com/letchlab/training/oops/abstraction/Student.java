package com.letchlab.training.oops.abstraction;

public abstract class Student extends TestStudent
{
    private String firstName;

    public String getFirstName()
    {
        return firstName;
    }

    private String lastName;

    public abstract void test();

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public abstract int rollNumber();

}
