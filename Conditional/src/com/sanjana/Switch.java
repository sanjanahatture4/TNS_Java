package com.sanjana;

import java.util.*;
public class Switch{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choice one number:");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Mudulus");
        System.out.println("Choice a number:");
        int no = sc.nextInt();
        System.out.println("Enter 1st number: ");
        int no1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int no2 = sc.nextInt();
        switch (no) {
            case 1:
                System.out.println("Addition is:" + (no1 + no2));
                break;
            case 2:
                System.out.println("Subtraction is:" + (no1 - no2));
                break;
            case 3:
                System.out.println("Multiplication is:" + no1 * no2);
                break;
            case 4:
                System.out.println("Division is is:" + no1 / no2);
                break;
            case 5:
                System.out.println("Modulus is:" + no1 % no2);
                break;
            default:
                System.out.println("Please enter a valid choice(1-5) ");
        }
    }

}