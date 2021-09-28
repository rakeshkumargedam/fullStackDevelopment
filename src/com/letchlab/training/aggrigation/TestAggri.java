package com.letchlab.training.aggrigation;

import java.util.ArrayList;
import java.util.List;

public class TestAggri {
    public static void main(String[] args) {
        Employee e1 = new Employee("RAKESH SIR",3001,"CEO");
        Employee e2 = new Employee("VINOD KURRE",3002,"COO");
        Employee e3 = new Employee("Rashmi",3003, "SOFTWARE ENGINEER TRAINEE");
        Employee e4 = new Employee("AMIT",3004,"SOFTWARE ENGINEER TRAINEE");
        Employee e5 = new Employee("RAHUL", 3005, "SOFTWARE ENGINEER TRAINEE");
        Employee e6 = new Employee("SAHIL", 3006, "SOFTWARE ENGINEER TRAINEE");



        List<Employee> employeeSoftwareEngg = new ArrayList<Employee>();
        employeeSoftwareEngg.add(e3);
        employeeSoftwareEngg.add(e4);
        employeeSoftwareEngg.add(e5);
        employeeSoftwareEngg.add(e6);


        List<Employee> employeeCeo = new ArrayList<Employee>();
        employeeCeo.add(e1);


        List<Employee> employeeCOO = new ArrayList<Employee>();
        employeeCOO.add(e2);

        Designation designationCeo = new Designation("CEO", employeeCeo);
        Designation designationCoo = new Designation("COO", employeeCOO);
        Designation designationSwet = new Designation("SOFTWARE ENGINEER TRAINEE", employeeSoftwareEngg);


        List<Designation> designations = new ArrayList<Designation>();
        designations.add(designationCeo);
        designations.add(designationCoo);
        designations.add(designationSwet);

        Ltechlab ltech = new Ltechlab("LTECHLAB",designations);

        System.out.println("Total number of employee in ltechlab : ");
        System.out.println(ltech.getTotalEmployeesInltechlab());


    }
}

