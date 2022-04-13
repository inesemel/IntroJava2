package com.company.class14april;

public class Class14april {

    //Write a class called Book that has the following fields:
    //name, authors, price
    //Write another class called Author that contains the following fields:
    // name, age, and the gender
    //Create a list of books and return the following output for each book
    // 'The author(s) of book 'NAME_OF_BOOK' is/are: -------'

    public static void main(String[] args) {


//        Author[] authors = new Author[]{
//                new Author("A. A. Milne", 140, "M")};
//
//        Book firstBook = new Book("Winnie the Pooh", authors, 10);
//
//        System.out.println("The author(s) of book " + firstBook.getName() +
//                " is/are: " + firstBook.getAuthor());


        Author[] authors = new Author[]{
                new Author("B. Pease", 72, "F"),
                new Author("A. Pease", 70, "M")};

        Book firstBook = new Book("Body Language", authors, 25);

        System.out.println("The author(s) of book " + firstBook.getName() +
                " is/are: " + firstBook.getAuthor());



        // UML diagrams
        // Unified Modelling Language


    }

}
