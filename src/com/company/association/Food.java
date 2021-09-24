package com.company.association;

import java.util.List;

public class Food {
    private String dishes;
    private List<Menu> foodType;

    public Food(String dishes, List<Menu> foodType) {
        this.dishes = dishes;
        this.foodType = foodType;
    }

    public String getDishes() {
        return this.dishes;
    }
}

