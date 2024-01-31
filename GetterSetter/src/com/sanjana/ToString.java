package com.sanjana;

public class ToString {
    private int marks;
    private int age_student;
    private char gender_student;
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    //tostring method
    @Override
    public String toString() {
        return "Tostring [marks=" + marks + ", age_student=" + age_student + ", gender_student=" + gender_student + "]";
    }


    public int getAge_student() {
        return age_student;
    }
    public void setAge_student(int age_student) {
        this.age_student = age_student;
    }
    public char getGender_student() {
        return gender_student;
    }
    public void setGender_student(char gender_student) {
        this.gender_student = gender_student;
    }
}
