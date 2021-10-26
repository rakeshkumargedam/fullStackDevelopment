package com.letchlab.training.oops.encapsulation;

public class Student
{

    private String firstName = "Rakesh Kumar";
    private String lastName;
    private String rollNumber;

    //Write only
  //  public void setFirstName(String firstName) {
  //      this.firstName = firstName;
  //  }

    // Read
    public String getFirstName() {
        return firstName;
    }
}
