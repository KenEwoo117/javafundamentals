package com.fundementals.labs;

public class Television {
    private double screenSize;
    private double price;
    private int numPorts;
    private boolean isItMountable;

    public Television(double screenSize, int numPorts){
        this(screenSize,799.99,5,true);
    }

    public Television(double screenSize, double price, int numPorts, boolean isItMountable) {
        this.screenSize = screenSize;
        this.price = price;
        this.numPorts = numPorts;
        this.isItMountable = isItMountable;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNumPorts(int numPorts) {
        this.numPorts = numPorts;
    }

    public int getNumPorts() {
        return numPorts;
    }

    public void setItMountable(){
        this.isItMountable = isItMountable;
    }

    public boolean isItMountable() {
        return isItMountable;
    }

    public void turnOn() {
        System.out.println("The " + screenSize + "in" + " Tv is on.");
    }

    public static void main(String[] args) {
        Television myTelevision = new Television(70.0,799.99,5,true);
        myTelevision.turnOn();

    }


}
