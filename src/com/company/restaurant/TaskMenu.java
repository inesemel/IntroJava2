package com.company.restaurant;

public enum TaskMenu {
    // For defining constant values

    FILE("New", "Open", "Open recent"),
    EDIT("Cut", "Copy", "Copy Path");

    private String firstItem;
    private String secondItem;
    private String thirdItem;

    TaskMenu(String firstItem, String secondItem, String thirdItem){
        this.firstItem = firstItem;
        this.secondItem = secondItem;
        this.thirdItem = thirdItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }

    public String getThirdItem() {
        return thirdItem;
    }

//    RED,
//    BLUE,
//    GREEN,
//    YELLOW
//

}
