package com.letchlab.training.abstraction;

public abstract class Torch {
    private String brand;
    private int cost;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract void operation();
}
