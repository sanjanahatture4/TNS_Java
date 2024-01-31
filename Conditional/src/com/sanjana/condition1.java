package com.sanjana;

import java.util.*;
public class condition1 {
    //if else
    public static void main(String[] args ) {
        System.out.println("Hello ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int no=sc.nextInt();
        ;       if(no%2==0)
        {
            System.out.println("It is even number");
        }
        else
        {
            System.out.println("It is odd number");
        }
        sc.close();
    }

}