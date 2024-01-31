package com.sanjana;

public class Comparison {
    public static void main(String[] args) {
        //creating string using literals//pool memory
        String s1="TNSIF";
        String s2="TNSIF";

        //creating string using new operator//heap memory
        String s3=new String("TNSIF");
        String s4=new String("TNSIF");

        //==-->object reference
        //equals-->data

        System.out.println(s1==s2);///true
        System.out.println(s1==s3);//false
        System.out.println(s2.equals(s1));//true
        System.out.println(s2.equals(s4));//true
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//true

        //compareTo s1==TNSIF compare TNSIF
        System.out.println(s1.compareTo("TNSIF"));// calculate unicode value of botth the string and gives the integer value
        System.out.println(s1.compareToIgnoreCase("tnsif"));
    }
}
