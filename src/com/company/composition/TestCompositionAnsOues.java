package com.company.composition;

import java.util.ArrayList;
import java.util.List;

public class TestCompositionAnsOues {
    public static void main(String[] args){
        Answer ans01 = new Answer("Long Answer", 10);
        Answer ans02 = new Answer("50to100 words Answer",5);
        Answer ans03 = new Answer("Short Answer",2);
        List<Answer> ans = new ArrayList<Answer>() ;
        ans.add(ans01);
        ans.add(ans02);
        ans.add(ans03);


    }
}
