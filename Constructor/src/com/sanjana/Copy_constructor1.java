package com.sanjana;

//copying values without using constructor
public class Copy_constructor1 {
    int i;
    String name;
    public Copy_constructor1(int i, String name) {

        this.i = i;
        this.name = name;
    }
    public Copy_constructor1() {}

    void Display()
    {
        System.out.println(i+" "+name);
    }

}
