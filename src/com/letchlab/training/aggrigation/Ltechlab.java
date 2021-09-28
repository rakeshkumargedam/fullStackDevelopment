package com.letchlab.training.aggrigation;

import java.util.List;

public class Ltechlab {

    private String ltechlabName;
    private List<Designation> designations;

    public Ltechlab (String name, List<Designation> designationList) {
        this.ltechlabName = name;
        this.designations = designationList;
    }
    public int getTotalEmployeesInltechlab() {
        int total = 0;

        List<Employee> employees;
        for (Designation desi: designations) {
            employees = desi.getEmployees();

            for (Employee employee: employees) {
                total++;
            }
        }


        return total;
    }
}

