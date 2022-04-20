package com.company.collections;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {


    //Sets is used for storing unique items
    // i. e. it cannot take in duplications

        //Items created inside a collection are transformed into objects

        // HashSet is an implementation of the Set Interface that does not store items
        // in any ordered fashion. i.e. items order may be randomised
//    Set<Integer> numbers = new HashSet<>();
//    numbers.add(1);
//    numbers.add(2);
//    numbers.add(3);
//    numbers.add(4);


//        Set<String> numbers = new HashSet<>();
//        numbers.add("Bobby");
//        numbers.add("Dave");
//        numbers.add("Larry");
//        numbers.add("John");
//        System.out.println(numbers);

        // TreeSet is an implementation of the Set interface that
        // compares and returns a sorted set of data from the input.

//        Set<String> names = new TreeSet<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Larry");
//        names.add("John");
//        names.add("Larry");
//        System.out.println(names);

        // LinkedHashSet is an implementation of the Set interface that
        // maintains the order of input of the data sorted in it.

//        Set<String> names = new LinkedHashSet<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Larry");
//        names.add("John");
//        names.add("Larry");
//        System.out.println(names);
//
        //Task: Write a method that takes in 6 numbers from the user and
        // returns that data in a sorted format using the set interface
        // and call that method in your main method

//        System.out.println(NumberSet.numberInput());


        // List is an ordered implementation of the Set Interface.
        // It contains indexes that allow us to retrieve data stored at a particular position
        // on the list.

        // An array list allows us to define a resizable array object to suit our needs
       // you don't have to define a size at object instantiation
//        List<String> names  = new ArrayList<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Larry");
//        names.add("John");
//        names.add("Larry");
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        System.out.println(names.get(3));

        //LinkedList is implemented as nodes that are joined or linked to each other

        // LinkedList -> O(n)
//        List<String> names  = new ArrayList<>();
//        names.add("Bobby");
//        names.add("Dave");
//        names.add("Larry");
//        names.add(2,"John");
//        names.add("Larry");
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//        System.out.println(names.get(3));

        // Write a method that will process the scores(integers) of 20 students and return
        // the max score using an ArrayList

        List<Integer> scores = new ArrayList<>();
        scores.add(5);
        scores.add(8);
        scores.add(10);
        scores.add(9);
        scores.add(5);
        scores.add(7);
        scores.add(4);
        scores.add(9);
        scores.add(5);
        scores.add(8);
        scores.add(10);
        scores.add(9);
        scores.add(5);
        scores.add(3);
        scores.add(10);
        scores.add(9);
        scores.add(5);
        scores.add(5);
        scores.add(5);
        scores.add(10);


//        int maximumScore = Collections.max(scores);
//        System.out.println("The maximum score is " + maximumScore);

        int maximum = 0;
        for (int i = 0; i < scores.size(); i++) {
            if(scores.get(i) > maximum){
                maximum = scores.get(i);
            }
        }
        System.out.println("The maximum score is " + maximum);

        //A queue is an interface for building LIFO and FIFO queues
        // FIFO = First In First out (start of the queue)
        // LIFO = Last In First Out(end of the queue)
        Queue<String> names = new LinkedList<>();
        names.offer("Bobby");
        names.offer("Dave");
        names.offer("Larry");
        names.offer("John");
        names.offer("Larry");

        System.out.println(names.offer("James")); // the offer() returns a boolean based on the success of the operation
        // The element() returns the first item of the queue but does not remove it from the queue
        // if the queue is empty, it returns a NoSuchElementException
        System.out.println(names.element());

        // The peek() works exactly like the element() but does not throw an exception
        // if the queue is empty

        System.out.println(names.peek());

        // The remove() removes the first element of the queue and returns it. It returns a NoSuchElementException
        // if the queue is empty
        System.out.println(names.remove());
        System.out.println(names);


        // The poll() removes the first element of the queue and returns it. It returns null if the queue is empty.
        System.out.println(names.poll());
        System.out.println(names);
    }

}
