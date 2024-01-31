package com.sanjana;
//do while loop

public class Loop3 {
    public static void main(String[] args) {
        System.out.println("Welcome to loops");
        System.out.println("While loop");
        int iCnt = 1;

        int iSum;
        for(iSum = 0; iCnt <= 100; ++iCnt) {
            if (iCnt % 5 == 0) {
                iSum += iCnt;
            }
        }

        System.out.println(iSum);

    }
}
