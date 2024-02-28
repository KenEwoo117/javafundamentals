package com.fundementals.labs;

public class LoopingLab {

    public void loopDeLoop() {
        int num = 0;
        while (num <= 15) {
            if (num == 5 ){
                System.out.println("Five");
            } else if (num == 10) {
                System.out.println("Ten");
            } else if (num == 15) {
                System.out.println("Fifteen");
            } else {
                System.out.println(num);
            }
            num++;
        }

    }

    public void divisibleByThree() {
        System.out.println("Numbers Divisible by 3 stopping at 30");
        for(int i = 0; i <= 30; i++) {
            if(i % 3 == 0) {
                System.out.print(i + ",");
            }
        }

    }










    public static void main(String[] args){
        LoopingLab myLoopingLab = new LoopingLab();
        //myLoopingLab.loopDeLoop();
        myLoopingLab.divisibleByThree();


    }
}
