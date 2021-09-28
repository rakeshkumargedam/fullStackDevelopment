package com.letchlab.training.composition;

public class Person {
    private Job job;
    public Person(){
        this.job =  new Job();
        job.setSalary(20000L);
        job.setRole("trainee");
    }
    public long getSalary(){
        return job.getSalary();

    }
    public String getRole(){
        return job.getRole();
    }
}
