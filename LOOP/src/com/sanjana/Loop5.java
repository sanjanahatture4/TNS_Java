package com.sanjana;
import java.util.*;

//nested for loop

public class Loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number upto which you want to print table:");
        int no = sc.nextInt();
        int i = 0;
        int j = 0;
        int iMult =1;

        for(i = 1; i <= no; i++) {
            for(j = 1; j <= 10;j++) {
                iMult = i * j;
                System.out.println("" + i + "*" + j + "=" + iMult);
            }
        }

    }

}
