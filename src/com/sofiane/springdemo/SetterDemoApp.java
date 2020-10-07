package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the Spring XMLFilepath
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean from Spring container --dependency setter injection in the XML configuration --
		Coach theCoach = context.getBean("myCricketCoach",Coach.class);
		//call methods on the bean
		//....
		System.out.println(theCoach.getDailyWorkout());
		
		//dependency Constructor injection 
		System.out.println(theCoach.getDailyFortune());
		
		//close the contex
		
		context.close();

	}

}
