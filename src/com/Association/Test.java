package com.Association;

public class Test
{
    public static void main (String[] args) {
        Hospital hospital = new Hospital("Raj");
        Doctor doctor = new Doctor("Amit");
        Doctor doctor1= new Doctor("sahil");
        Doctor doctor2= new Doctor("Arun");
        Doctor doctor3= new Doctor("ram");

        System.out.println(doctor.getDoctorName() + " is the doctor of " + hospital.getName() + "Hospital");
        System.out.println(doctor1.getDoctorName() + " is the doctor of " + hospital.getName() + "Hospital");
        System.out.println(doctor2.getDoctorName() + " is the doctor of " + hospital.getName() + "Hospital");
        System.out.println(doctor3.getDoctorName() + " is the doctor of " + hospital.getName() + "Hospital");

    }
}
