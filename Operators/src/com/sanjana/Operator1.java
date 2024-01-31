package com.sanjana;

public class Operator1 {

            public static void main(String[] args) {
            System.out.println("Welcome to operators");
            int a = 10;
            int b = 20;
            //arithmatic operators
            System.out.println(a + b);
            System.out.println(a - b);
            System.out.println(a * b);
            System.out.println(a / b);
            System.out.println(a % b);
            //relational operators
            System.out.println(a == b);
            System.out.println(a != b);
            System.out.println(a >= b);
            System.out.println(a <= b);
            System.out.println(a > b);
            System.out.println(a < b);
            String res = a != b ? "yes" : "no";//ternary operator
            System.out.println(res);
            //logical operators
            if (a == 30 && b == 20) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

            if (a != 30 && b != 20) {
                System.out.println(false);
            } else {
                System.out.println(true);
            }

            System.out.println(a != 10);

        }

}

