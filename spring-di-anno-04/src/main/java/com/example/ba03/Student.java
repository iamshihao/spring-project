package com.example.ba03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component(value = "myStudent")
@Component("myStudent03")
public class Student {
    @Value(value = "刘备")
    private String name;
    @Value(value = "20")
    private int age;
    @Autowired(required = true)
    @Qualifier("mySchool")
    private School school;

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
                ", school=" + school +
                '}';
    }
}
