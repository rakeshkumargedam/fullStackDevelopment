package com.aggregation;

import java.util.List;

public class Teams
{
    private String name;
    private List<Player>players;

    public Teams(String name, List<Player>playerList){
        this.name=name;
        this.players=playerList;
    }
     public List<Player> getPlayers(){
        return this.players;

     }
}
