package com.ltechlab.letchlab.training.oops.inheritance.aggregation;

import java.util.List;

/**
 * Department class contains list of student objects. it is associated with Student class through its object.
 */
public class Department
{
    private String name;
    private List<Student> students;

    public Department(String name, List<Student> studentList){
        this.name = name;
        this.students = studentList;
    }
    public List<Student> getStudents() {
        return this.students;
    }
}
