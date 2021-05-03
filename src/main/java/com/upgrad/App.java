package com.upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.upgrad");

        //applicationContext.refresh();
        Calculator calculator = (Calculator) applicationContext.getBean("calculator");
        calculator.compute("add", 5, 9);
        calculator.compute("subtract", 5, 9);
        calculator.compute("multiply", 5, 9);
        calculator.compute("divide", 5, 9);
        calculator.compute("mod", 5, 9);
    }
}
