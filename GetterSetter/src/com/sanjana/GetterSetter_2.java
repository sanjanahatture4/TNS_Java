package com.sanjana;

//we can also implement constructor instead of set method..or set method instead of constructor
public class GetterSetter_2 {
    private int roll_no;
    private String name;
    private int age;
    private String city;

    public GetterSetter_2(int roll_no, String name, int age, String city) {

        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return " [Roll no=" + getRoll_no() + ",Name=" + getName().toUpperCase() + ",Age=" + getAge()
                + ",City=" + getCity().toUpperCase() + "]";
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}
