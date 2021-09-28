package com.letchlab.training.association.onetomany;

public class Team {

    private String teamNames;
    private String sponser;
    public Team(String teamNames, String sponser){
        this.teamNames= teamNames;
        this.sponser= sponser;
    }

    public String getTeamNames() {

        return teamNames;
    }
    public String getSponser(){
        return sponser;
    }
}
