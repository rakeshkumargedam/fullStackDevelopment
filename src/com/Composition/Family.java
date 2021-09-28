package com.Composition;

public class Family
{
    private Home home;
    public Family(){
        this.home = new Home();
        home.setIncome(200000L);
        home.setRole("head");
    }
    public long getIncome(){
        return home.getIncome();
    }
    public String getRole(){
        return home.getRole();
    }
    public int getExpenditure(){
        return home.getExpenditure();
    }

}
