package com.company.composition;

public class TestCompositionBook {
    public static void main(String[] args){
        Library L1 = new Library();
        System.out.println("Name Of Book                             "+ " Author Name   "+ " Price  ");
        System.out.println(L1.getName()+"  "+ L1.getAuthorName()+ "  "+ L1.getPrice());

    }
}
