package com.letchlab.training.association.onetomany;

import java.util.ArrayList;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) {
        List<Team> teams = new ArrayList<>();
        Team team1 = new Team("RCB","MPL");
        Team team2 = new Team("CSK", "MYNTRA");
        Team team3 = new Team("KKR","JIO");
        teams.add(team1);
        teams.add(team2);
        teams.add(team3);


        Ipl ipl = new Ipl( teams);
        List<Team> teamList = ipl.getTeams();
        for(Team team : teamList){
            System.out.println("Different team in ipl are " + team.getTeamNames() +" and their sponsers are "+ team.getSponser() );
        }

    }
}
