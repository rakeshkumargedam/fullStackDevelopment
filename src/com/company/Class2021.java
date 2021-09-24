package com.company;

import java.util.ArrayList;
import java.util.List;

public class Class2021 {
    public Class2021() {
    }

    public static void main(String[] args) {
        Class student = new Class();
        List<Object> person = new ArrayList();
        student.setName("Rashmi");
        student.setMarks(74.15D);
        student.setResult("Pass");
        person.add(student.getName());
        person.add(student.getMarks());
        person.add(student.getResult());
    }
}
