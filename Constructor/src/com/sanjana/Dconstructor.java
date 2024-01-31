package com.sanjana;

//default constructor
//default constructor is the constructor that is used to initialise the default values like 0,null,etc
//if we not provide any constructor in any program then JVM will by default provides it i.e java provides default
// constructor

public class Dconstructor {
    int i;
    char ch;
    String str;

    public Dconstructor() {

        i=0;
        ch='\0';
        str="";
        System.out.println("This is default constructor...");
    }
    //parameterised constructor is the constructor which is specifically used to initialise the resources/properties
    public Dconstructor(int i, char ch, String str) {
        super();
        this.i = i;
        this.ch = ch;
        this.str = str;
    }
    void Display()
    {
        System.out.println("This is display method...");
        System.out.println(i);
        System.out.println(ch);
        System.out.println(str);
    }




}
