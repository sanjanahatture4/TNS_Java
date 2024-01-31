package com.sanjana;

public class Cons_Overloading {
    //constructor overloading is the concept of having a constructor with different parameters and that constructor is of same class
    int emp_id;
    String emp_name;
    char emp_gender;//in capital i.e F or M

    int std_id;
    String std_name;
    long number;
    char standard;

    public Cons_Overloading(int emp_id, String emp_name, char emp_gender) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_gender = emp_gender;
    }

    public Cons_Overloading(int std_id, String std_name, long number, char standard) {
        this.std_id = std_id;
        this.std_name = std_name;
        this.number = number;
        this.standard = standard;
    }
    //here there are two different constructors with different parameters we overload the constructor here with different parameters
    public void Display_std()
    {
        System.out.println("Student id:"+std_id);
        System.out.println("Student name:"+std_name);
        System.out.println("Student phone number:"+number);
        System.out.println("Student standard:"+standard);

    }
    public void Display_emp()
    {
        System.out.println("Employee id:"+emp_id);
        System.out.println("Employee name:"+emp_name);
        System.out.println("Employee gender:"+emp_gender);


    }




}
