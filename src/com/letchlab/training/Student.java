package com.letchlab.training;

public class Student
{
    String name;
    String address;
    int houseNumber;

    Student (String name, int houseNumber) {
        this.setName(name);
        this.setHouseNumber(houseNumber);
    }

    Student () {
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
