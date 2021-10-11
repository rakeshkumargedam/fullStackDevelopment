package com.company.composition;

import java.util.List;

public class Question {
    private List<Answer> ans;

    Question(List<Answer> ans) {
        this.ans = ans;
    }

}
