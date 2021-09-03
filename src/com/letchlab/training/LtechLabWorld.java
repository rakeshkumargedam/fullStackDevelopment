package com.letchlab.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Access Modifiers :
 * 1. Public
 * 2. private
 * 3. protected
 * 4. default
 * Arrays, String, Map, Tree, Binary Tree, Linklist, Stack, Queue, Sorting
 */

public class LtechLabWorld
{
    /**
     * Main Method starting point for any java application
     */

    public static void main(String[] args) {
     /*   GetNames getNames = new GetNames();
        String name = "My Name is ";
        getNames.getValue(name,5);
        getNames.getValue(name,4);
        getNames.getValue(name,4); */
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Sahil",12345);
        student.setAddress("Dawda Colony Raipur");
        studentList.add(student);
         student = new Student("Amit",5679879);
         student.setAddress("Gudgaon");
         studentList.add(student);
     Student student1 = new Student();
     student1.setAddress("Texas");
     student1.setName("Rakesh");
     student1.setHouseNumber(10701);
     studentList.add(student1);

        for(int i=0; i< studentList.size(); i++) {
            System.out.println(studentList.get(i).getName());
            System.out.println(studentList.get(i).getAddress());
            System.out.println(studentList.get(i).getHouseNumber());
        }

    }

}
