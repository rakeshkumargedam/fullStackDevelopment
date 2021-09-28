package com.letchlab.training.composition;

public class TestComposition {
    public static void main(String[] args) {
        Person p1 = new Person();
        Job job = new Job();
        job.setId(20);
        job.setRole("trainee");
        System.out.println(p1.getRole());
        System.out.println(p1.getSalary());


    }
}
