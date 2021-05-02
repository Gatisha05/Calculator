package com.upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        calculator.compute("add", 5, 9);
    }
}
