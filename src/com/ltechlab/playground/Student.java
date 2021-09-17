package com.ltechlab.playground;

public class Student {
   private String name;
   private int  RollNumber;
   private String address;

   public Student (String name, int roleNmber, String address) {
       this.name = name;
       this.RollNumber = roleNmber;
       this.address = address;
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void add(Student student) {
    }
}


