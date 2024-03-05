package com.fundementals.labs;

public class StaticLab {

    public static void main(String[] args) {

        double current = 8.0;
        double voltage = 60.0;
        double resistance = 12.0;

        double calcdCurrent = calcCurrent( voltage, resistance);
        System.out.println("Calculated Current: " + calcdCurrent + " amperes ");

        double calcdVoltage = calcVoltage(current, resistance);
        System.out.println("Calculated Voltage: " + calcdVoltage + " Volts");

        double calcdResistance = calcResistance(current,voltage);
        System.out.println("Calculated Resistance: " + calcdResistance + " ohms");


    }



    public static double calcCurrent(double voltage, double resistance) {
        return voltage / resistance;
    }

    public static double calcVoltage (double resistance, double current) {
        return current * resistance;
    }

    public static double calcResistance (double current, double voltage) {
        return voltage / current;
    }


}
