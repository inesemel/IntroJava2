package com.company.restaurant;

public enum RestaurantMenu {

    APPETIZER("Steamed Paw and cafe latte"),
    MAINCOURSE("Continental rise and deep fried chicken"),
    DESSERT("Cupcake and milk chocolate ice cream");

    private String firstItem;


    RestaurantMenu(String firstItem){
        this.firstItem = firstItem;

    }

    public String getFirstItem() {
        return firstItem;
    }



}
