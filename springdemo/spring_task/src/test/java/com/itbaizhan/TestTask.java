package com.itbaizhan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTask {
    public static void main(String[] args) {
//        new ClassPathXmlApplicationContext("applicationContext.xml");
        new AnnotationConfigApplicationContext(SpringConfig.class);
    }
}
