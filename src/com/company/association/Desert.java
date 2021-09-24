package com.company.association;

import java.util.List;

public class Desert {
    private String name;
    private List<Menu> foodType;

    public Desert(String name, List<Menu> foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    public String getName() {
        return this.name;
    }
}

