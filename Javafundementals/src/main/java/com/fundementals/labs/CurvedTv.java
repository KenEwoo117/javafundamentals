package com.fundementals.labs;

public class CurvedTv extends Television {
    private int curvatureRadius;

    public CurvedTv(double screenSize, double price,int numPorts,
                    boolean isItMountable, int curvatureRadius){
        super(screenSize,price,numPorts,isItMountable);
        this.curvatureRadius = curvatureRadius;
    }

    public int getCurvatureRadius() {
        return curvatureRadius;
    }

    public void setCurvatureRadius() {
        this.curvatureRadius = curvatureRadius;
    }

    public void showCurvature() {
        System.out.println(curvatureRadius + "mm");
    }

    @Override
    public void turnOn(){
        super.turnOn();
        System.out.println("The " + curvatureRadius +"mm" + " Tv is off.");
    }

    public static void main(String[] args){
        CurvedTv myCurvedTv = new CurvedTv(70.0,899.99,8,false,3000);
        myCurvedTv.showCurvature();
        myCurvedTv.turnOn();
    }

}
