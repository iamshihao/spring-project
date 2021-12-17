package com.example.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "myStudent")
@Component("myStudent02")
public class Student {
    @Value(value = "刘备")
    private String name;
    @Value(value = "20")
    private int age;

    public Student() {
        System.out.println("===student的无参构造===");
    }

    /*public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
