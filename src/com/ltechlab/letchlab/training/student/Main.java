package com.ltechlab.letchlab.training.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. Create a Student Object.
 * 2. Add this student into List.
 * 3. Instance Variable : Instance variables are the variables which get defined in class level and accessibles in
 * entire class.
 * 4. Method Variable : are the variables which get defined in method level and can not get accessed by any other
 * methods.
 *
 */
public class Main
{

    static String instanceVariable = null;

    public static void main(String[] args) {
        String checkVariable =instanceVariable;
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the student details");
        System.out.println("Please Enter the roll number");
        String name1 = scanner.nextLine();
        int nameNumber = Integer.parseInt(name1);
        System.out.println("Please Enter the student name");
        String studentName = scanner.nextLine();

        System.out.println("Please enter the address");
        String addr = scanner.nextLine();
        System.out.println(nameNumber + " " + studentName + " " + addr);
        Student student;
        student = new Student("Amit",12345,"Gurgaon");
        students.add(student);
        student = new Student("Rahul", 234,"Raipur");
        students.add(student);


        for (int i=0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
            System.out.println(students.get(i).getRollNumber());
            System.out.println(students.get(i).getAddress());
        }

        System.out.println(checkVariable);

    }

    public void checkVariable() {
        System.out.println(instanceVariable);

    }
}
