package com.company.studentscores;

public class Score {

    private String course;
    private int scoreValue;

    public Score(String course, int scoreValue){
        this.course = course;
        this.scoreValue = scoreValue;
    }

    public int getScoreValue() {
        return scoreValue;
    }
}
