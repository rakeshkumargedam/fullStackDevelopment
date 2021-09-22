package com.ltechlab.letchlab.training.student;

public class Student
{
     String name;
     int rollNumber;
     String address;

     public Student(String name, int rollNumber, String address) {
         this.name = name;
         this.rollNumber = rollNumber;
         this.address = address;
     }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }
}
