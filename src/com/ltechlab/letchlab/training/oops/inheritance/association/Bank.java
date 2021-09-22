package com.ltechlab.letchlab.training.oops.inheritance.association;

/**
 * Rules to create a constructor :
 *
 * 1. When we create a constructor it should always have the same name as class name.
 */
public class Bank
{
    private String name;

    public Bank(String bankName) {
        this.name = bankName;
    }

    public String getName() {
        return this.name;
    }


}
