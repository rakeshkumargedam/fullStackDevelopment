package com.AssociationOnetomany;

import java.util.List;

public class Doctor
{

    private List<Hospital>hospitals;

    public Doctor( List<Hospital>hospitalList){
        this.hospitals=hospitalList;

    }

    public List<Hospital> getHospitals(){
        return this.hospitals;
    }

}
