package com.letchlab.training.aggrigation;

import java.util.List;

public class Designation {

    private String name;
    private List<Employee> employee;

    public Designation(String name, List<Employee> employeeList){
        this.name = name;
        this.employee = employeeList;
    }
    public List<Employee> getEmployees() {
        return this.employee;
    }
}

