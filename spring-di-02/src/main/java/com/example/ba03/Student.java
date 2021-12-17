package com.example.ba03;

public class Student {
    private String myName;
    private int myAge;
    private School mySchool;

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMySchool(School mySchool) {
        this.mySchool = mySchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", mySchool=" + mySchool +
                '}';
    }
}
