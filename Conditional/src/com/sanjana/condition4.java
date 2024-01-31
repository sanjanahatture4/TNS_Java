package com.sanjana;

import java.util.*;
public class condition4 {
    //if statement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int no = 0;
        no = sc.nextInt();
        System.out.println("Odd numbers are:");

        for(int i = 1; i <= no; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}