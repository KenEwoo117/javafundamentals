package com.fundementals.labs;

public class NumbersLab {
 public static void main(String[] args) {
     NumbersLab myNumbersLab = new NumbersLab();
     wideningConversion(myNumbersLab.myA , myNumbersLab.myB, myNumbersLab.myC);
     narrowingConversions(myNumbersLab.edd, myNumbersLab.ed, myNumbersLab.eddy);
     //System.out.println(myNumbersLab.Hexidecimal);
     //System.out.println(myNumbersLab.Binary);
 }

 short Binary = 0b11101;
 byte Hexidecimal = 0x1D;

 public void numericTypes() {
     System.out.println(Hexidecimal);
     System.out.println(Binary);

 }
    byte myA = 50;
    short myB = 500;
    int myC = 5000;

 public static void wideningConversion(byte myA,short myB,int myC ) {
     int fromByte = myA;
     long fromShort = myB;
     float fromInt = myC;
     System.out.println("My samples are " + fromByte + " & "
             + fromShort);
     System.out.println("My Float is " +  fromInt);

 }
 double edd = 4886.45;
 float ed = 566.06f;
 long eddy = 6700553;

 public static void narrowingConversions(double edd, float ed, long eddy) {
     long intoFinn = (long) edd;
     int intoJake = (int) ed;
     short intoBmo = (short) eddy;
     System.out.println("my edd turns = " + intoFinn );
     System.out.println("my ed turns = " + intoJake);
     System.out.println("my eddy turns = " + intoBmo);

 }



}
