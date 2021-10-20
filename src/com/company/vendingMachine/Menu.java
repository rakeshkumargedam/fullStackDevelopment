package com.company.vendingMachine;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {

        Product P01 = new Product("Coke", 15);
        Product P02 = new Product("Sprite", 20);
        Product P03 = new Product("Chips", 10);
        Product P04 = new Product("Water", 10);
        Product P05 = new Product("Fanta", 40);
        Product P06 = new Product("Frooty", 25);
        List<Product> Items = new ArrayList<>();
        Items.add(P01);
        Items.add(P02);
        Items.add(P03);
        Items.add(P04);
        Items.add(P05);
        Items.add(P06);

    }
}
