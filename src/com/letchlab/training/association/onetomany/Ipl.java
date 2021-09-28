package com.letchlab.training.association.onetomany;

import java.util.List;

public class Ipl {

    private List<Team> teams;
    public Ipl( List<Team> teamList){

        this.teams= teamList;
    }


    public List<Team> getTeams(){
        return this.teams;
    }

}
