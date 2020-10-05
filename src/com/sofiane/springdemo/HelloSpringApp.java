package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring app file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the been from the spring container 
		Coach theCoach = context.getBean("tenis",Coach.class);
		
		//call method on been 
		System.out.println(theCoach.getDailyWorkout());
		
		//close the contex
		context.close();
	}

}
