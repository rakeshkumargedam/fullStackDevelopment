package com.ltechlab.playground;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main (String[] args) {
        List<Student> students = new ArrayList<>();

        Student student = new Student("Amit", 12345, "Gurgaon");
        students.add(student);
        student = new Student("Sahil",234567,"Raipur");
        students.add(student);

       for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getAddress());
            System.out.println(students.get(i).getRollNumber());

        }

       /*  students.stream().forEach(student1 -> {
            System.out.println(student1.getName());
            System.out.println(student1.getRollNumber());
            System.out.println(student1.getAddress());
        }); */
    }
    }
