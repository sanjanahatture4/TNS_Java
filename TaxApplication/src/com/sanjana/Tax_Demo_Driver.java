package com.sanjana;

import java.util.*;
public class Tax_Demo_Driver {

    char gender;
    int age;
    float sal;
    String name;

    public static void main(String[] args) {
        System.out.println("Welcome to tax calculation application...");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");

        String name=sc.next();

        System.out.println("Enter your Annual income:");

        float sal=sc.nextFloat();

        System.out.println("Enter your age:");

        int age=sc.nextInt();

        System.out.println("Enter your gender:");

        char gender=sc.next().charAt(0);

        Person p1 = new Person(name,sal,age,gender);
        System.out.println(p1);
        Tax_Calculation tc=new Tax_Calculation(age,gender,sal);
        float ret=tc.tax_Return();
        System.out.println("Your payable tax is:"+ret);



    }



}
