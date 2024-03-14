package com.fundamentals.main.practice;

public class HousePhone extends Telephone {

    public HousePhone(int volume, int[] numberKeys,
                      int sendKey, String screen) {
        super(volume, numberKeys, sendKey, screen);
    }

    @Override
    public void receiveCall() {
        System.out.println("Receiving phone call");

    }

    @Override
    public void sendCall() {
        System.out.println("Sending Phone call");

    }

    @Override
    public void endCall() {
        System.out.println("Ending Phone call");

    }
}
