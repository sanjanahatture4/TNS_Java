package com.sanjana;

import java.util.*;
public class Many_catch_Demo {

    public static void main(String arg[])
    {
        int a=10;
        int b=0;
        int arr[]=new int[3];
        arr[0]=2;
        arr[1]=34;
        arr[2]=21;
        try {
            System.out.println(a/b);
            System.out.println(arr[3]);

        }catch(ArrayIndexOutOfBoundsException e1)
        {
            System.err.println("Array index is out of bound"+e1.getMessage());
        }
        catch(Exception e2)
        {
            System.err.println("It is not possible to divide any number by 0:"+e2.getMessage());
        }
    }


}
