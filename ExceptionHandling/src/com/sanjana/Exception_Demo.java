package com.sanjana;

import java.util.*;
//when we dont know that what type of exception will gonna occur that time we can create reference of
//the parent class i.e of Exception and implement it
//Also we can implement many catch block
public class Exception_Demo {
    public static void main(String arg[])
    {
        int iRet=0;
        char ch;
        Exp_1 ex=new Exp_1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name:");
        String str=sc.next();
        ex.String_Demo(str);
        System.out.println("Enter the index on which you want to know the character:");
        int id=sc.nextInt();
        try {
            ch=ex.index_Ret(str, id);
            System.out.println("Character is:"+ch);
        }catch(Exception e)
        {
            System.err.println("Please enter the index number between(1-5) as"+e.getMessage());
        }
        finally {}
        System.out.println("Enter 1st number:");
        int no1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int no2=sc.nextInt();
        try {
            iRet=ex.Division(no1, no2);
            System.out.println("Division is:"+iRet);
        }catch(Exception e1)
        {
            System.err.println("You cant enter 0 as a denominator  because any number is not"+e1.getMessage());
        }



    }








}