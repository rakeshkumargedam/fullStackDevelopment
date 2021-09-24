package com.company;

import java.util.Scanner;

public class Clac2021 extends Inheritance {
    public Clac2021() {
    }

    public void multi(int x, int y) {
        int z = x * y;
        System.out.println("Multiplication " + z);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Clac2021 value = new Clac2021();
        value.add(a, b);
        value.Sub(a, b);
        value.multi(a, b);
    }
}


