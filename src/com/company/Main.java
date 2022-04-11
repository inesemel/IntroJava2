package com.company;

import com.company.vehicle.RestaurantMenu;
import com.company.vehicle.TaskMenu;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Abstraction is a mechanism that is focused on hiding implementation details
        // from the user.
        // The user doesn't need to know how it was done, they only need to know than it works.



//        Vehicle car = new Motorcycle();
//        car.startEngine(true);
//        System.out.println(TaskMenu.FILE.getFirstItem());


//        Create an enum to model  a restaurant menu
        // They offer 3 categories of meals: Appetizer, Main course and dessert
        //Appetizer - Steamed Paw and cafe latte
        //Main course - Continental rise and deep fried chicken
        // Dessert - Cupcake and milk chocolate ice cream

        System.out.println("Our appetizer for today: " + RestaurantMenu.APPETIZER.getFirstItem());
        System.out.println("Our main course for today: " + RestaurantMenu.MAINCOURSE.getFirstItem());
        System.out.println("Our dessert for today: " + RestaurantMenu.DESSERT.getFirstItem());


    }
}
