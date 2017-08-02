package com.revature;


import com.revature.pojo.*;
import com.revature.service.AppService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Hello Spring ORM");

        ApplicationContext ac = new ClassPathXmlApplicationContext("WEB-INF/beans.xml");
        AppService app = (AppService) ac.getBean("AppService");

        User testUser = new User();

        testUser.setUserEmail("ram@ram.ram");
        /*
        testUser.setUserEmail("ram@ram.ram");
        testUser.setUserFirstName("Ram");
        testUser.setUserLastName("Sanchez");
        testUser.setUserPassword("123");

        app.saveUser(testUser); */
        System.out.println(app.getUserByEmail(testUser));


    }
}