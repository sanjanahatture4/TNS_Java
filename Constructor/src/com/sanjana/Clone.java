package com.sanjana;

//copying objects using clone method of object class
//this is the way from we can create a clone of objects using clone method of object class
public class Clone {
    int id;
    String name;
    public Clone(int id, String name) {

        this.id = id;
        this.name = name;
    }
    public Object clone()throws CloneNotSupportedException
    {
        return super.clone();
    }

}
