package com.fundementals.labs;

public class StringsLab {
public static void main(String[] args) {
    StringsLab myStringsLab = new StringsLab();
    System.out.println(myStringsLab.poetry());
    myStringsLab.stringMethods(myStringsLab.note);





}



public String poetry() {
    return " Jack and Jill Went up the hill\n to fetch a pail of water\n.Jack fell down and broke his crown\n and Jill came " +
            "tumbling after.\n";
}
String note = "Feet first into hell";



public void stringMethods(String note) {
    System.out.println(note.toLowerCase());
    System.out.println(note.charAt(5));
    System.out.println(note.length());


}



}
