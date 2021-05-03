package com.example.ricardgo403.eostresfdidemo;

import com.example.ricardgo403.eostresfdidemo.controllers.*;
import com.example.ricardgo403.eostresfdidemo.datasources.FakeDataSource;
import com.example.ricardgo403.eostresfdidemo.services.impl.ConstructorGreetingServiceWOImpl;
import com.example.ricardgo403.eostresfdidemo.services.impl.PrototypeBean;
import com.example.ricardgo403.eostresfdidemo.services.impl.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan(basePackages = {"com.example.ricardgo403.eostresfdidemo","com.example.ricardgo403.eostresfdidemo2"})
@SpringBootApplication
public class DependencyInjectionDemoProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(DependencyInjectionDemoProjectApplication.class, args);
		var ctx = SpringApplication.run(DependencyInjectionDemoProjectApplication.class, args);
		var myController = (MyController) ctx.getBean("myController");
		System.out.println("myController ctx greeting: " + myController.getGreeting());

		System.out.println("------Primary bean");
		var myControllerRefactored = (MyControllerRefactored) ctx.getBean("myControllerRefactored");
		System.out.println("myControllerRefactored ctx greeting: " + myControllerRefactored.getGreeting());
		System.out.println("------Property");
		var propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("PropertyInjectedController ctx greeting: " + propertyInjectedController.getGreeting());

		System.out.println("------Setter");
		var setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("SetterInjectedController ctx greeting: " + setterInjectedController.getGreeting());

		System.out.println("------Constructor");
		var constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("ConstructorInjectedController ctx greeting: " + constructorInjectedController.getGreeting());

		System.out.println("------Constructor 2");
		var constructorGreetingServiceWO = (ConstructorGreetingServiceWOImpl) ctx.getBean("constructorGreetingServiceWO");
		System.out.println("ConstructorGreetingServiceWOImpl ctx greeting: " + constructorGreetingServiceWO.sayGreeting());

		System.out.println("------Profiles");
		var i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println("I18nController ctx greeting: " + i18nController.getGreeting());

		var petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		System.out.println("----Bean scopes-------");
		var singletonBean1 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		var singletonBean2 = ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		var prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		var prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());

		var fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcUrl());
	}

}
