package com.example.categorydetailexampleapp;

public class Food {




    /*
     These final static arrays wil represent the data for each category. If we have 3 categories we will have 3 arrays.

     Each array can have as many elements as it wants.

     Each element in the category array will contain the data for the specific food items in this category

     as a placeholder if you dont have any images yet you can put any int

     static means this array belongs to the food class as a whole not to one particular food item

     b/c the array is public, we can access it from other activity files

     final means its vals cannot change elsewhere in any other activity files

     Initializing the contents with an initializer list, ex for integeers would be :

     int[] myNums = {1,2,3,4};
     String[] myNames = {"Preeth"};

     in this case the array is of type food so we must call the food constructor for each element in the food array
     */




    public static final Food[] myBreakfast = {
            new Food("Pancakes", 6.99, "4 pancakes", R.drawable.),
            new Food("Waffles", 7.50, "Crispy Golden Brown", R.drawable.),
    };

    public static final Food[] myLunch = {
            new Food("Sandwich", 8.00, "4 pancakes", R.drawable.),
            new Food("Waffles", 10.00, "Crispy Golden Brown", R.drawable.),

    };

    public static final Food[] myDinner = {
            new Food("Pancakes", 10.00, "4 pancakes", R.drawable.),
            new Food("Waffles", 13.00, "Crispy Golden Brown", R.drawable.),

    };








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
