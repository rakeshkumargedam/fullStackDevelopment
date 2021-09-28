package com.letchlab.training.composition.practice;

public class Engineering {
    private Branch branch;
    public Engineering(){
        this.branch = new Branch();
        branch.setFees(5000);
    }
     public int getFees(){
        return branch.getFees();
     }
}
