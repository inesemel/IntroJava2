package com.company.vehicle;


//import com.company.Vehicle;

import com.company.Vehicle;

public class Car implements Vehicle {

    public void startEngine(boolean key){
        if (key){
            System.out.println("Engine started");
        } else {
            System.out.println("Insert key to start");
        }
    }
    public void stopEngine(){
        System.out.println("Car engine stopped");
    }


}
