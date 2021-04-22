package com.example.ricardgo403.eostresfdidemo;

import com.example.ricardgo403.eostresfdidemo.controllers.*;
import com.example.ricardgo403.eostresfdidemo.services.impl.ConstructorGreetingServiceWOImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.example.ricardgo403.eostresfdidemo","com.example.ricardgo403.eostresfdidemo2"})
@SpringBootApplication
public class DependencyInjectionDemoProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionDemoProjectApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionDemoProjectApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("myController ctx greeting: " + myController.getGreeting());

		System.out.println("------Primary bean");
		MyControllerRefactored myControllerRefactored = (MyControllerRefactored) ctx.getBean("myControllerRefactored");
		System.out.println("myControllerRefactored ctx greeting: " + myControllerRefactored.getGreeting());
		System.out.println("------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("PropertyInjectedController ctx greeting: " + propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("SetterInjectedController ctx greeting: " + setterInjectedController.getGreeting());

		System.out.println("------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("ConstructorInjectedController ctx greeting: " + constructorInjectedController.getGreeting());

		System.out.println("------Constructor 2");
		ConstructorGreetingServiceWOImpl constructorGreetingServiceWO = (ConstructorGreetingServiceWOImpl) ctx.getBean("constructorGreetingServiceWO");
		System.out.println("ConstructorGreetingServiceWOImpl ctx greeting: " + constructorGreetingServiceWO.sayGreeting());

		System.out.println("------Profiles");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("I18nController ctx greeting: " + i18nController.getGreeting());

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

	}

}
