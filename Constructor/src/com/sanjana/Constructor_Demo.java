package com.sanjana;

public class Constructor_Demo {

    public static void main(String[] args) {
        Dconstructor d=new Dconstructor();
        Dconstructor d1=new Dconstructor(43,'D',"Sanjana");
        d1.Display();
        System.out.println();

        Cons_Overloading ovr=new Cons_Overloading(01,"Sanjana",'F');
        Cons_Overloading ovr1=new Cons_Overloading(24,"Sagar",1120936528,'B');
        ovr.Display_emp();
        ovr1.Display_std();




    }

}