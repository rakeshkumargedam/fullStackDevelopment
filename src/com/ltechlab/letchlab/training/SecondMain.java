package com.ltechlab.letchlab.training;

public class SecondMain
{
    public static void main(String[] args) {
        String name = "My Name is ";
        GetNames getNames = new GetNames();
        getNames.getValue(name,1);
        getNames.getValue(name,2);
        getNames.getValue(name,3);
    }
}
