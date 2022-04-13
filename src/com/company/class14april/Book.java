package com.company.class14april;

import java.util.Arrays;

public class Book {

    private String name;
    private Author[] authors;
    private int price;


    public Book(String name, Author[] authors, int price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

//    public Author[] getAuthors() {
//        return authors;
//    }

    public String getAuthor() {
        String names = "";
        for (Author author : authors){
            names+= author.getAuthorName() + "  ";
        }
        return names;

    }

    public String getName() {
        return name;
    }
}
