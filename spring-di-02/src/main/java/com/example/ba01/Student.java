package com.example.ba01;

import com.example.ba02.School;

public class Student {
    private String name;
    private int age;

    private School School;

    public void setSchool(com.example.ba02.School school) {
        System.out.println("setSchool:" + school);
        School = school;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("setName:" + name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("setAge:" + age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", School=" + School +
                '}';
    }
}
