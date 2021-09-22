package com.ltechlab.letchlab.training.oops.inheritance.aggregation;

import java.util.List;

/**
 * College class contains list of department objects. It is associated with Department class through its objects.
 */
public class College
{
    private String collegeName;
    private List<Department> departments;

    public College (String name, List<Department> departmentList) {
        this.collegeName = name;
        this.departments = departmentList;
    }

    /**
     * Count total students of all departments for a given college.
     */

    public int getTotalStudentsInCollege() {
        int total = 0;

        List<Student> students;
        for (Department dept: departments) {
           students = dept.getStudents();

           for (Student student: students) {
               total++;
           }
        }


        return total;
    }
}
