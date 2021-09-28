package com.letchlab.training.composition.practice2;

public class Amazon {

    private Customer customer;
    public Amazon(){
        this.customer = new Customer();
        customer.setName("vickey");
        customer.setAddress("hauz khas new delhi");
    }
    public String getName(){
        return customer.getName();
    }
    public String getAddress(){
        return customer.getAddress();
    }
}
