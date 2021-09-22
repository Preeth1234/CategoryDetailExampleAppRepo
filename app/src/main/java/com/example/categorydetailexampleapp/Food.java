package com.example.categorydetailexampleapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable
{
    public int getImageResourceID() {
        return imageResourceID;
    }



/*
     These final static arrays wil represent the data for each category. If we have 3 categories we will have 3 arrays.

     Each array can have as many elements as it wants.

     Each element in the category array will contain the data for the specific food items in this category

     as a placeholder if you dont have any images yet you can put any int

     static means this array belongs to the food class as a whole not to one particular food item

     b/c the array is public, we can access it from other activity files

     final means its vals cannot change elsewhere in any other activity files

     Initializing the contents with an initializer list, ex for integers would be :

     int[] myNums = {1,2,3,4};
     String[] myNames = {"Preeth"};

     in this case the array is of type food so we must call the food constructor for each element in the food array
     */




    public static final Food[] myBreakfast = {
            new Food("Pancakes", 6.99, "4 pancakes", R.drawable.breakfast),
            new Food("Waffles", 7.50, "Crispy Golden Brown", R.drawable.breakfast),
    };

    public static final Food[] myLunch = {
            new Food("Sandwich", 8.00, "4 pancakes", R.drawable.lunch),
            new Food("Waffles", 10.00, "Crispy Golden Brown", R.drawable.lunch),

    };

    public static final Food[] myDinner = {
            new Food("Pancakes", 10.00, "4 pancakes", R.drawable.dinner),
            new Food("Waffles", 13.00, "Crispy Golden Brown", R.drawable.dinner),

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
        this.imageResourceID = imageResourceID;



        //default so we don't get null pointer error
    }



    /** This is a "constructor" of sorts that is needed with the Parceable interface to
     * tell the intent how to create a Food object when it is received from the intent
     * basically it is setting each instance variable as a String or Int
     * if the instance variables were objects themselves you would need to do more complex * code.  We need to read in the String, double, and int data.
     *
     * @param parcel    the parcel that is received from the intent
     */

    public Food(Parcel parcel) {
        name = parcel.readString();
        price = parcel.readDouble();
        description = parcel.readString();
        imageResourceID = parcel.readInt();
    }

    @Override
/**
 * This is what is used when we send the Food object through an intent
 * It is also a method that is part of the Parceable interface and is needed
 * to set up the object that is being sent.  Then, when it is received, the
 * other Food constructor that accepts a Parcel reference can "unpack it"
 *
 */
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(price);
        dest.writeString(description);
        dest.writeInt(imageResourceID);
    }
    public Food() {
        name = "";
        price = 0;
        description = "";
        imageResourceID = 0;
    }



    // this code is needed for the Food class to work with Parcelable
    public static final Parcelable.Creator<Food> CREATOR = new
            Parcelable.Creator<Food>() {

                @Override
                public Food createFromParcel(Parcel parcel) {
                    return new Food(parcel);
                }

                @Override
                public Food[] newArray(int size) {
                    return new Food[0];
                }
            };

    // same for any class that implements parcelable only difference is the class name


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

    /**
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     */

    @Override
    public int describeContents() {
        return 0;
    }


}
