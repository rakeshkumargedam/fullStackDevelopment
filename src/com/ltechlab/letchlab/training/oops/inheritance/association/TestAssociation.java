package com.ltechlab.letchlab.training.oops.inheritance.association;

public class TestAssociation
{
    public static void main(String[] args) {
        Bank bank = new Bank("ICICI");
        Employee employee = new Employee("RAKESH");
        Employee employee1 = new Employee("Vinod");
        Employee employee2 = new Employee("Sahil");

        System.out.println(employee.getEmployeeName() + " is the employee of " + bank.getName() + " Bank");
        System.out.println(employee1.getEmployeeName() + " is the employee of " + bank.getName() + " Bank");
        System.out.println(employee2.getEmployeeName() + " is the employee of " + bank.getName() + " Bank");



    }
}
