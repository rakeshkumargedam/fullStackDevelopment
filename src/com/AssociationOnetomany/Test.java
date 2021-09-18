package com.AssociationOnetomany;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) {
        List<Hospital> hospitals = new ArrayList<>();
        Hospital h1 = new Hospital("raj");
        Hospital h2 = new Hospital("IQ");
        Hospital h3 = new Hospital("amit");

        hospitals.add(h1);
        hospitals.add(h2);
        hospitals.add(h3);

        Doctor doctor = new Doctor(hospitals);
        List<Hospital> hospitalList = doctor.getHospitals();
        for (Hospital hospital: hospitalList){
            System.out.println( "Hospital name is " + hospital.getHospitalName());
        }
    }
}
