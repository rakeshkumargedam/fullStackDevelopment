package com.letchlab.training.oops.inheritance.aggregation;

import java.util.ArrayList;
import java.util.List;

public class TestAggregation
{

    public static void main(String[] args) {
        Student s1 = new Student("Sahil",12345,"Mechanical");
        Student s2 = new Student("Amit",43365,"BA");
        Student s3 = new Student("Rashmi",8798, "Mechanical");
        Student s4 = new Student("Rahul",8768,"BCA");
        Student s5 = new Student("Vinod", 8769, "BCA");

        /**
         * Create a List of Student for all Mechanical Department Students
         */
        List<Student> studensMech = new ArrayList<Student>();
        studensMech.add(s1);
        studensMech.add(s3);

        /**
         * Create a List of Student for all BCA Department Students
         */
        List<Student> studentsBCA = new ArrayList<Student>();
        studentsBCA.add(s4);
        studentsBCA.add(s5);

        /**
         * Create a List of Student for all BA Department Students
         */
        List<Student> studentsBA = new ArrayList<Student>();
        studentsBA.add(s2);

        Department departmentMech = new Department("Mechanical", studensMech);
        Department departmentBCA = new Department("BCA", studentsBCA);
        Department departmentBA = new Department("BA", studentsBA);

        /**
         * Department of Mechanical
         */
        List<Department> departments = new ArrayList<Department>();
        departments.add(departmentMech);
        departments.add(departmentBCA);
        departments.add(departmentBA);

        College college = new College("IIT Delhi",departments);

        System.out.println("Total number of students in college : ");
        System.out.println(college.getTotalStudentsInCollege());


    }
}
