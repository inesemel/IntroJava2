package com.company.studentscores.S;

import com.company.studentscores.Score;

import java.util.ArrayList;

public class Student {
    // Write a class called Student that has the following properties called name(string), age(int),
    // scores(arrayList<Score>).
    // Write another class called Score that has the following properties course(string), scoreValue(int)
    // Add a method to your students class to get the average score of all the courses
    // that a particular student offers.
    private String name;
    private int age;
    private ArrayList<Score> scores;

    public Student (String name, int age, ArrayList<Score> scores){
//        super(course, scoreValue);
        this.name = name;
        this.age = age;
        this.scores = new ArrayList<Score>();
    }
    public int averageScore (){
        int sum = 0;
        for (Score scoreValue : scores) {
            sum += scoreValue.getScoreValue();
        }
        return sum;
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void getName() {
        System.out.println(name);
    }
}
