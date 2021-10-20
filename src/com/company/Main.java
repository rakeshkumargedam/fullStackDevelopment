package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Square value = new Square();
        value.setSide(50);
        System.out.println("Side of Square-" + value.getSide());
        System.out.println("Side of Area-" + value.getSide() * value.getSide());
        System.out.println("Side of Perimeter-" + 4 * value.getSide());
    }
}


