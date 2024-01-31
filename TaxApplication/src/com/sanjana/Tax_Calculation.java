package com.sanjana;

public class Tax_Calculation extends Person {
    private static String name;
    int age;
    char gender;
    float salary;
    float tax;
    float rate;
    float tax_n;

    public Tax_Calculation(int age, char gender, float salary) {

        super(name, salary, age, gender);
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.tax = 0.0f;
        this.rate = 0.0f;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    public float tax_Return() {
        if (gender == 'f') {


        } else if (gender == 'm')
            if ((age > 24 && age < 60) && salary < 200000) {
                rate = 10.0f;
                tax = (rate / 100) * salary;
                tax_n = tax;

            } else if ((age > 24 && age < 60) && (salary > 200000 && salary < 600000)) {
                rate = 20;
                tax = (rate / 100) * salary;
                tax_n = tax;


            } else if ((age > 24 && age < 60) && (salary > 600000 && salary < 1000000)) {
                rate = 30;
                tax = (rate / 100) * salary;
                tax_n = tax;


            } else if ((age > 24 && age < 60) && (salary > 1000000 && salary < 1500000)) {
                rate = 35;
                tax = (rate / 100) * salary;
                tax_n = tax;


            } else if (age > 60) {

            }
        return tax_n;
    }
}


