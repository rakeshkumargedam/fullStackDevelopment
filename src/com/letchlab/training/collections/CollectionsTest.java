package com.letchlab.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsTest
{

    public static void main(String[] args) {
        //List<String> stringList = new ArrayList<>();

       /* String[] strings = new String[5];   ///Static Array

        strings[0] = "Rakesh";
        strings[1] = "Rashmi";
        strings[2] = "Vinod";
        strings[3] = "Amit";
        strings[4] = "Rahul";
        strings[5] = "Rahul V";

        System.out.println(strings.length);
        System.out.println(strings[0]);
        System.out.println(strings[1]);
        System.out.println(strings[2]);
        System.out.println(strings[3]);
        System.out.println(strings[4]); */


        /*List<String> stringList = new ArrayList<String>();
        stringList.add("Rakesh");
        stringList.add("Rashmi");
        stringList.add("Vinod");
        stringList.add("Amit");
        stringList.add("Rahul K");
        stringList.add("Rahul V");
        stringList.add("Sahil");

        stringList.stream().forEach(s -> {
            System.out.println(s);
        });*/



        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Rakesh");
        stringArrayList.add("Rashmi");
        stringArrayList.add("Amit");
        stringArrayList.add("Vinod");
        stringArrayList.add("Rahul K");
        stringArrayList.add("Rahul V");
        stringArrayList.add("Sahil");

        stringArrayList.stream().forEach( name -> {
            System.out.println(name);
        });

        String[][] strings1 = new String[4][4];
        strings1[0][0] = "Rakesh";
        strings1[0][1] = "Rashmi";
        strings1[1][0] = "Amit";
        strings1[1][1] = "Vinod";
        strings1[2][0] = "Sahil";
        strings1[2][1] = "Rahul V";

        System.out.println(strings1[0][0]);

        /**
         * Tic Toc Toe
         *
         *  _ _ _
         * |0|1|2|
         * |3|4|5|
         * |6|7|8|
         *
         *
         */

    }


}
