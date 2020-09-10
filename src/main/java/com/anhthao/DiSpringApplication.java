package com.anhthao;

import com.anhthao.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiSpringApplication {

    public static void main(String[] args) {
        ApplicationContext alc = SpringApplication.run(DiSpringApplication.class, args);


        SetterDIController setterDIController = (SetterDIController) alc.getBean("setterDIController");
        System.out.println(setterDIController.getGreeting());
        System.out.println("------------");

        PropertyDIController myController = (PropertyDIController) alc.getBean("propertyDIController");
        System.out.println(myController.getGreeting());
        System.out.println("------------");

        ConstructorDIController constructorDIController = (ConstructorDIController) alc.getBean("constructorDIController");
        System.out.println(constructorDIController.getGreeting());
        System.out.println("------------");

        MyController myControllerPR = (MyController) alc.getBean("myController");
        System.out.println(myControllerPR.sayHello());
        System.out.println("------------");

        I18nController i18nController = (I18nController) alc.getBean("i18nController");
        System.out.println(i18nController.sayHello());
    }

}
