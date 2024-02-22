package com.fundementals.labs;

import java.util.Scanner;

public class OperatorsLab {




    public void dearAuntSally() {
        double echo1 = 10 + 32 * 12/ 3;
        double charlie1 = (10 + 32) * 12/ 3;
        System.out.println(echo1);
        System.out.println(charlie1);

    }

    public void aOperators(int pete, int miles) {
        pete += miles;
        System.out.println("+= operator " + pete);
        miles *= pete;
        System.out.println("*= operator " + miles);
        pete %= miles;
        System.out.println("%= operator " + pete);

    }



    public static  int scannerTask() {
        int vari = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Input number: ");
        int myInput = scanner.nextInt();

        int total = myInput % vari;



        return total;

    }










    public static void main(String[] args) {
        OperatorsLab myOperatorsLab = new OperatorsLab();
        myOperatorsLab.dearAuntSally();
        myOperatorsLab.aOperators(616,1610);
        int result = scannerTask();
        System.out.println("Modulus value % " + result);




    }
}
