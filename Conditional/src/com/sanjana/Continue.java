package com.sanjana;

import java.util.*;
public class Continue {
    public static void main(String args[])
    {
        //continue keyword is used to skip a part of code which is not required
        //to print odd numbers upto the number the user enters
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int no=sc.nextInt();
        for(i=0;i<=no;i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println(i);
        }




        //if we want to print the numbers except 5&8
        for(i=0;i<=no;i++)
        {
            if(i%5==0 || i%8==0)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
