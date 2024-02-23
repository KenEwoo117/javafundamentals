package com.fundementals.labs;

public class ConditionsLab {


public static void stringComparison(String alpha1, String alpha2){
    if (alpha1.equals(alpha2)){
        System.out.println("Both alphas are equal." );
    } else {
        System.out.println("Both alphas aren't equal");
    }
}



    public static String varyingGrades(char inputGrades) {

        switch (inputGrades) {
            case 'E':
                return "Excellent Grade";
            case 'V':
                return "Very Good Grade";
            case 'G':
                return "Good Grade";
            case 'A':
                return "Average Grade";
            case 'F':
                return "Failed Grade";
            default:
                return "Not a valid grade";
        }
    }

public static void main (String[] args) {
    ConditionsLab myConditionsLab = new ConditionsLab();
    myConditionsLab.stringComparison("Galen","Starkiller");
    char inputGrades = 'E';
    String description = varyingGrades(inputGrades);
    System.out.println(description);

    }
}
