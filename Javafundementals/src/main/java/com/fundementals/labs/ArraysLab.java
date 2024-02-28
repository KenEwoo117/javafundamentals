package com.fundementals.labs;

public class ArraysLab {
    public void iceCreamFlavors() {
        String[] flavors = {"Chocolate" , "Neapolitan" , "Strawberry",
                "Mint Choco Chip", "Chunky Monkey", "Phish Food" ,
                "Karamel Sutra Core" ,"Mint chocolate chance ","That Green Nut ", "Everything But The..."};
        for(String iceCream : flavors) {
            System.out.println(iceCream);
        }
    }

    public void kcScores() {
        int[][] myScores = {{40, 26}, {28, 10}, {33, 28}, {34, 30}, {13, 19}, {24, 31}, {30, 6}, {24, 31},
                {26, 23}, {32, 35}, {24, 17}, {40, 9}, {23, 16}, {23, 3}, {31, 21},};
        for (int h = 0; h < myScores.length; h++) {
            for (int a = 0; a < myScores[h].length; a++) {
                System.out.println("[" + h + "]" + "[" + a + "] = "
                        + myScores[h][a]);
            }
        }
    }



    public static void main(String[] args) {
        ArraysLab myArraysLab = new ArraysLab();
        //myArraysLab.iceCreamFlavors();
        //myArraysLab.kcScores();


    }
}
