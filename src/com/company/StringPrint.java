package com.company;

import java.util.Scanner;

public class StringPrint {
    public StringPrint() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type what you like:");
        String line = sc.nextLine();
        System.out.println(line);
    }
}

