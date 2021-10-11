package com.aggregation;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args) {
         Player p1 = new Player("Amit",7,"RCB");
         Player p2 =new Player("Sahil",9,"RCB");
         Player p3 = new Player("ram",8,"KKR");
         Player p4 = new Player("Rahul",66,"KKR");
         Player p5= new Player("Raju",68,"KKR");

        List<Player>playerRCB = new ArrayList<Player>();
        playerRCB.add(p1);
        playerRCB.add(p2);

        List<Player>playersKKR=new ArrayList<Player>();
        playersKKR.add(p3);
        playersKKR.add(p4);
        playersKKR.add(p5);
        Teams teamsKKR=new Teams("KKR",playersKKR);


        Teams teamsRCB= new Teams("RCB",playerRCB);
        List<Teams>teamsList= new ArrayList<>();
         teamsList.add(teamsKKR);
         teamsList.add(teamsRCB);
         Games games=new Games("Cricket",teamsList);
        System.out.println("Totalnumber of Teams in games");
        System.out.println(games.getTotalTeamsinGames());
    }
}
