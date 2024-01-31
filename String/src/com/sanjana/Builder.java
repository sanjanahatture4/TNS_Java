package com.sanjana;

public class Builder {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Hello");
        sb.append("abc");//now original string is changed
        System.out.println(sb);
        //insert method
        sb.insert(1,"hiiii");
        System.out.println(sb);
        //replace method
        sb.replace(0,2,"shruti");
        System.out.println(sb);
        //delete method
        sb.delete(2, 4);
        System.out.println(sb);
        //reverse method
        sb.reverse();
        System.out.println(sb);
    }

}
