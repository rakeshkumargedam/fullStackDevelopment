package com.Composition;

public class TestComposition {
    public static void main(String[] args) {
        Family f1 = new Family();
        Home home = new Home();
        home.setExpenditure(10000);
        home.setRole("papa");

        System.out.println(f1.getIncome());


    }
}
