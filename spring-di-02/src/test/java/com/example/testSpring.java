package com.example;

import com.example.ba01.Student;
import com.example.ba02.School;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.Date;

public class testSpring {
    @Test
    public void test01() {
        String config = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("student");
        System.out.println("student对象为：" + student);

        Date date = (Date) ac.getBean("date");
        System.out.println("date的时间为:" + date);
    }
    @Test
    public void test02(){
        Student student = new Student();
        student.setName("刘备");
        student.setAge(50);

        School school = new School();
        school.setName("三国学院");
        school.setAddress("蜀中");

        student.setSchool(school);
        System.out.println("student===" + student);
    }
    @Test
    public void test03(){
        String config = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("student");
        System.out.println("student===" + student);
    }
    @Test
    public void test04(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        com.example.ba03.Student student = (com.example.ba03.Student) ac.getBean("student");
        System.out.println("student===" + student);
    }
    @Test
    public void test05(){
        String config = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        com.example.ba03.Student student = (com.example.ba03.Student) ac.getBean("student2");
        System.out.println("student===" + student);
    }
}
