package com.sanjana;

import java.util.*;
public class condition3
//nested if else statement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your gender..Please Enter in capital letters:");
        String gender = sc.next();
        if (gender.equals("MALE")) {
            if (age < 21) {
                System.out.println("You are not eligible for voting");
            } else if (age >= 21) {
                System.out.println("You are  eligible for voting");
            }
        } else if (gender.equals("FEMALE")) {
            if (age < 18) {
                System.out.println("You are not eligible for voting");
            } else if (age >= 18) {
                System.out.println("You are eligible for voting");
            }
        } else {
            System.out.println("Enter valid age OR Enter gender in CAPITAL LETTER");
        }

    }

}