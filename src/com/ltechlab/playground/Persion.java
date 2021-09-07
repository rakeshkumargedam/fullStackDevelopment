package com.ltechlab.playground;

import java.util.ArrayList;
import java.util.List;

public class Persion {
    public static void main(String[] args) {
        String name = "amit";
        int Marks = 80;
        int history = 80;
        List<Object>friuts = new ArrayList<>();
        friuts.add("apple");
        friuts.add("bnana");
        friuts.add(name);
        friuts.add(Marks);
        System.out.println(friuts);
    }
}
