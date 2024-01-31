package com.sanjana;

public class Wrapper {

    public static void main(String[] args) {
        //wrapper classes are the classes which wrap the primitive data types into objects
        //wrapper classes are of 2 types boxing and unboxing and autoboxing

        //unboxing
        Integer i=new Integer(10);
        System.out.println(i);
        int b=i.intValue();//method to complete object value into primitive type
        System.out.println(b);
        Boolean e=new Boolean(false);
        System.out.println(b);
        boolean b1=e.booleanValue();
        //without using intValue
        int c=i;
        System.out.println(c);
        boolean b2=e;
        System.out.println(b2);


    }
}
