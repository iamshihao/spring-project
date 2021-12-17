package com.example;

import com.example.entity.SysUser;
import com.example.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService service = (UserService) ac.getBean("UserService");
        SysUser user = new SysUser();
        user.setName("刘备");
        user.setAge(50);
        service.addUser(user);
    }
}
