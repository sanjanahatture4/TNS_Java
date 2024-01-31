package com.sanjana;

public class Operations {
    public static void main(String[] args) {
        String s1=new String(" India ");
        String s2=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s1.length());
        int a=s1.length();
        System.out.println(a);
        String s3=s1.substring(1,7);
        System.out.println(s3);
        System.out.println(s1.trim());
        //trim removes all  the spaces before and after the string but not the middle one
        System.out.println(s1.stripTrailing());
        //it removes the space after the word
        System.out.println(s1.isEmpty());


        //String comparison

        s1="Good morning Students";
        s2=new String(s1);

        //== check the memory hashcode values address
        //equals check the values or the data is same or not


        System.out.println(s1.equals(s2));//it is true
        System.out.println(s1==s2);//it is false because s and s2 addresses are not equal


    }

}
