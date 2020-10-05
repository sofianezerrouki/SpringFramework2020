package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring app file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the been from the spring container 
		Coach coachTenis = context.getBean("tenisCoach",Coach.class);
		
		//call method on been 
		System.out.println(coachTenis.getDailyWorkout());
		
		//close the contex
		
		Coach coachBaseBall = context.getBean("baseBallCoach",Coach.class);
		
		System.out.println(coachBaseBall.getDailyWorkout());
		
		context.close();
	}

}
