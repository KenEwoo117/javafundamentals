package com.fundamentals.main.practice;

public class SailBoat extends Boat{
    private String sailType;

    public SailBoat(String sailType) {
        this("Oak", "Brown", "Large", 6,sailType);
    }

    public SailBoat(String hullType, String hullColor,
                    String boatSize, int totalSeats, String sailType ){
        super(hullType,hullColor,boatSize,totalSeats);
        this.sailType = sailType;
    }

    public String getSailType() {
        return sailType;
    }

    public void sailBoatFunction() {
        System.out.println("This Boat Sails");
    }

    @Override
    public void boatFunction() {
        System.out.println("This Boat Docks. ");
    }

    public void sailBoatFunction(String hullType){
        System.out.println("This " + hullType + " boat sails");
    }


    public static void main(String[] args){
        SailBoat mySailBoat = new SailBoat("Canvas");
        //System.out.println(mySailBoat.getTotalSeats());
        //System.out.println(mySailBoat.getHullColor());
        //mySailBoat.sailBoatFunction(mySailBoat.hullType);
        mySailBoat.boatFunction();
        mySailBoat.boatFunction("Timber");
    }
}
