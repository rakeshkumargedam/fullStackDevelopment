package com.company.association;

import java.util.ArrayList;
import java.util.List;

public class TestAssociation {
    public TestAssociation() {
    }

    public static void main(String[] args) {
        Menu foodtype01 = new Menu("Maharastrian");
        Menu foodtype02 = new Menu("Punjabi");
        Menu foodtype03 = new Menu("SouthIndian");
        List<Menu> Maharastrian = new ArrayList();
        Maharastrian.add(foodtype01);
        List<Menu> Punjabi = new ArrayList();
        Punjabi.add(foodtype02);
        List<Menu> SouthIndian = new ArrayList();
        SouthIndian.add(foodtype03);
        new Food("kohlapuri veg", Maharastrian);
        new Food("chole", Punjabi);
        new Food("Idli", SouthIndian);
        new Food("Tanduri roti", Punjabi);
        new Food("panner masala", Punjabi);
        new Food("misal", Maharastrian);
        new Food("vada pav", Maharastrian);
        new Food("Dosa", SouthIndian);
        new Desert("Basundi", Maharastrian);
        new Desert("Kheer", Punjabi);
        new Desert("payasam", SouthIndian);
        System.out.println("Welcome To Hotel Extent Today's Maharatrian  Menu is" + Maharastrian.get(0) + " with" + Maharastrian.get(0));

        System.out.println("Welcome To Hotel Extent \n Today's Punjabi Menu is \n" + Punjabi.get(0) + "\n with" + Punjabi.get(0));
        System.out.println("Welcome To Hotel Extent \n Today's SouthIndian Menu is \n" + SouthIndian.get(0) + "\n with" + SouthIndian.get(0));
    }
}

