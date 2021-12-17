package com.example.ba01;

import org.springframework.stereotype.Component;

//@Component(value = "myStudent")
@Component("myStudent")
public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("===student的无参构造===");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
