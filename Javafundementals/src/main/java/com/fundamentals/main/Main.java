package com.fundamentals.main;

import com.fundamentals.main.practice.HousePhone;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        houseExample();
        basicStatements();
    }
    public static void basicStatements() {
        System.out.println("This is my first sentence.");
        System.out.println("I am new to Java.");
        System.out.println("This Java Course is cool.");
        System.out.println("I am learning stuff everyday.");
    }

    // Single comment
    /*Multi-line comment
    This is a second line
    and a third.
    * */

    public static void houseExample() {
        House myHouse = new House("Concrete", "Red",
                "Cedar Shingle", 30);
        myHouse.doorFunction();
        System.out.println(myHouse.getEntranceDoorColor());
    }

    public static void phoneExample() {
        int[] keys = {0,1,2,3,4,5,6,7,8,9};
        HousePhone myTelephone = new HousePhone(7, keys, 0,"LCD");
        myTelephone.sendCall();
    }

}

