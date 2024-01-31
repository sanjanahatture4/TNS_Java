package com.sanjana;


import java.util.*;
    public class GS3 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Employee id:");
            int id=sc.nextInt();
            System.out.println("Enter the Employee name:");
            String name=sc.next();
            String name1=name.toUpperCase();
            System.out.println("Enter the Employee salary:");
            float sal=sc.nextFloat();
            System.out.println("Enter the Employee gender type 'M' or 'F' only:");
            char gender=sc.next().charAt(0);
            char ch1=Character.toUpperCase(gender);

            Gettersetter gs=new Gettersetter(id,name1,sal,ch1);

            //getclass method will get the class of input object i.e class of gs
            //System.out.println(gs.getClass());


            System.out.println(".............Confidential information of Employee is..........");
            System.out.println("Employee id is:"+gs.getEmp_id());
            System.out.println("Employee name is:"+gs.getEmp_name());
            System.out.println("Employee salary is:"+gs.getSalary());
            System.out.println("Employee gender is:"+gs.getGender());

            //Gettersetter_2
            System.out.println("Enter roll no:");
            int roll_no=sc.nextInt();
            System.out.println("Enter name:");
            String std_name=sc.next();
            System.out.println("Enter age:");
            int age=sc.nextInt();
            System.out.println("Enter city:");
            String city=sc.next();

            Gettersetter_2 g1=new Gettersetter_2(roll_no,std_name,age,city);
            System.out.println(".............Confidential information of Student is..........");
            System.out.println(g1);

            //tostring
            System.out.println("Enter student age:");
            int student_age=sc.nextInt();
            System.out.println("Enter student gender:");
            char student_gender=sc.next().charAt(0);

            System.out.println("Enter student marks:");
            int student_marks=sc.nextInt();
            Tostring st=new Tostring();
            st.setAge_student(student_age);
            st.setGender_student(student_gender);
            st.setMarks(student_marks);
            System.out.println(st);







        }


    }

