package com.example.categorydetailexampleapp;

public class Food {
    private String name;
    private double price;
    private String description;
    private int imageResourceID;
    // This will allow us to have a picture
    // Android studio catalogs images with int values

    public Food(String name, double price, String description, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    public Food(String name, double price, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.description = "";

        //default so we don't get null pointer error
    }

    /*
    To auto generate code, go to code - generate on the top menu
    make sure your cursor is positioned where you want the code to go
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString()
    {
        return this.name;

        // The toString method is called when we "print" an object reference and also called if you call it as toString()
        // The reason wwe only want the name is because this is what will be displayed in our listView when we show the options the user can click on
    }
}
