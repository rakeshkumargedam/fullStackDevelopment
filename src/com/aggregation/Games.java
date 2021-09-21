package com.aggregation;

import java.util.List;

public class Games
{
    private String gamesName;
    public List<Teams>teamsList;
    public Games (String name, List<Teams>teamsList) {
        this.gamesName=name;
        this.teamsList=teamsList;

    }
    public int getTotalPlayersInTeams(){
        int total = 0;

        List<Player>players;
        for (Teams team: teamsList) {

            players = team.getPlayers();
            for (Player player:players){
                total++;
            }
        }
     return total;
            
        
     }
}

