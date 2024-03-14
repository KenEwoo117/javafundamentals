package com.fundamentals.main.practice;

public class Boat {
protected String hullColor;
protected String hullType;
protected String boatSize;
protected int totalSeats;

    public Boat() {

    }

    public Boat(String hullColor){
        this(hullColor,"aluminum","small",6);
    }


    public Boat(String hullColor, String hullType, String boatSize
        ,int totalSeats){
        this.hullColor = hullColor;
        this.hullType = hullType;
        this.boatSize = boatSize;
        this.totalSeats = totalSeats;
    }

    public void setHullColor(String hullColor) {
        this.hullColor = hullColor;
    }

    public String getHullColor() {
        return hullColor;
    }

    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    public String getHullType() {
        return hullType;
    }

    public void setBoatSize(String boatSize) {
        this.boatSize = boatSize;
    }

    public String getBoatSize() {
        return boatSize;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void boatFunction() {
        System.out.println("This Boat Floats");
    }

    public void boatFunction(String hullColor){
        System.out.println("This " + hullColor + " boat floats.");
    }


    public static void main(String[] args){
        Boat myBoat = new Boat("Black", "Aluminum","Small",8);
        //System.out.println(myBoat.getHullColor());
        //System.out.println(myBoat.totalSeats);
        myBoat.boatFunction(myBoat.hullColor);

    }



}
