package com.fundementals.labs;

public class SmartTv extends Television{
    private String smartFeatures;

    public SmartTv(double screenSize,double price,
                   int numPorts,boolean isItMountable, String smartFeatures){
        super(screenSize,price,numPorts,isItMountable);
        this.smartFeatures = smartFeatures;
    }

    public String getSmartFeatures() {
        return smartFeatures;
    }

    public void setSmartFeatures(String smartFeatures) {
        this.smartFeatures = smartFeatures;
    }

    public void listSmartFeatures() {
        System.out.println("Smart Features: " + smartFeatures);
    }

    @Override
    public void setPrice(double price){
        super.showPrice();
        System.out.println("The Smart TV Price is: $" + price);
    }


    public static void main(String[] args) {
        SmartTv mySmartTv = new SmartTv(60.0,799.99,6,true,"Voice Control, Streaming Apps, Web Browsing");
        mySmartTv.listSmartFeatures();
        mySmartTv.setPrice(1200.00);
    }
}
