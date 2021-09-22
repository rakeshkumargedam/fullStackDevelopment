package com.ltechlab.letchlab.training.oops.inheritance.aggregation;

/**
 * Characters -- a , b, c
 * String --- Set of characters , digit  (Alphnumeric)
 * int --- Only contains integer values.
 */
public class Student
{
    private String name;
    private int id;
    private String  dept;

    public Student(String inputName, int inputId, String inputDept) {
        this.id = inputId;
        this.name = inputName;
        this.dept = inputDept;
    }

}
