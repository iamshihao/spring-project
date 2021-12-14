package com.example;

import com.example.service.Impl.SomeServiceImpl;
import com.example.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class testSpring {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService service = (SomeService) ac.getBean("someService");
        service.doSome();
    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象数量:" + nums);
        String[] names = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println("容器中定义的对象名字:" + name);
        }
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date data = (Date) ac.getBean("data");
        System.out.println("Data:" + data);

    }
}
