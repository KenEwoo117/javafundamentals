package com.fundamentals.main.practice;

public class Boat {
private String hullColor;
private String hullType;
private String boatSize;
private int totalSeats;

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

    public static void main(String[] args){
        Boat myBoat = new Boat("Black", "Aluminum","Small",8);
        System.out.println(myBoat.getHullColor());
        System.out.println(myBoat.totalSeats);

    }



}
