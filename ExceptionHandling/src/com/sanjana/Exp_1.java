package com.sanjana;

public class Exp_1 {
    public int Division(int no1,int no2)
    {
        int res;
        res=no1/no2;
        return res;
    }
    public void String_Demo(String str)
    {
        char chr[]=str.toCharArray();
        int i=0;
        System.out.println("Your name in terms of array is:");
        for(i=0;i<str.length();i++)
        {
            System.out.print("["+chr[i]+"]"+"=>");
        }
        System.out.println();
    }
    public char index_Ret(String str,int id)
    {
        return str.charAt(id);


    }

}
