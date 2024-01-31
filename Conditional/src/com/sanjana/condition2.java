package com.sanjana;

import java.util.*;
public class condition2 {
    //else if statement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age:6");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible for voting");
        } else if (age >= 18) {
            System.out.println("You are  eligible for voting");
        } else {
            System.out.println("please enter valid age number!!");
        }


    }

}
