package com.fundamentals.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Java");
        houseExample();
        boatExample();
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
        House myHouse = new House();
        myHouse.doorFunction();
        myHouse.entranceDoorColor = "Red";
        myHouse.foundationType = "Concrete";
        myHouse.roofStyle = "Cedar Shingles";
        myHouse.totalWindows = 30;
        System.out.println(myHouse.entranceDoorColor);
    }


    public static void boatExample(){
        Boat myBoat = new Boat();
        myBoat.boatFunction();
        myBoat.hullColor = "Silver";
        myBoat.hullType = "Steel";
        myBoat.boatSize = "Large";
        myBoat.totalSeats = 5;
        System.out.println(myBoat.totalSeats);

    }

}