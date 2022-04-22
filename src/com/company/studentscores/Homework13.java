package com.company.studentscores;

import java.util.ArrayList;
import com.company.studentscores.Score;
public class Homework13 {
    public static void main(String[] args) {
        // Write a class called Student that has the following properties called name(string), age(int),
        // scores(arrayList<Score>).
        // Write another class called Score that has the following properties course(string), scoreValue(int)
        // Add a method to your students class to get the average score of all the courses
        // that a particular student offers.

        ArrayList<Score> myCourses = new ArrayList<Score>();
        myCourses.add(new Score("math", 9));
        myCourses.add(new Score("english", 7));
//        Score  myScore = new Score("math", 9);


        // some mystic package
        com.company.studentscores.S.Student inese =
                new com.company.studentscores.S.Student("Inese", 22, myCourses);
        inese.getName();


        System.out.println(inese.averageScore());

//
//        System.out.println(Arrays.toString(myCourses.toArray()));
//        System.out.println(myScore.getScoreValue());
//        Student firstStudent = new Student("Inese", 22, myScore);
//        System.out.println(firstStudent.getScores());
//        System.out.println(firstStudent.averageScore());


    }
}
