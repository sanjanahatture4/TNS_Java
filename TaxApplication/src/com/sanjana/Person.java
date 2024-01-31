package com.sanjana;

public class Person {
    String name;
    float salary;
    int age;
    char gender;
    public Person(String name, float salary, int age, char gender) {

        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender + "]";
    }




}