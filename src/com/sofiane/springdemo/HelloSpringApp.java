package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring app file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the been from the spring container 
		Coach coachBaseBall = context.getBean("baseBallCoach",Coach.class);

		//call method on been 
		System.out.println(coachBaseBall.getDailyWorkout());
		
		//call method for fortunes
		System.out.println("BaseBall Coach : "+coachBaseBall.getDailyFortune());
		
		//Retrieve the been from the spring container
		Coach trackCoach = context.getBean("trackCoach",Coach.class);
		
		System.out.println("Track Coach : "+trackCoach.getDailyFortune());	
		
		//Retrieve the been from the spring container
		Coach tenisCoach = context.getBean("tenisCoach",Coach.class);
				
		System.out.println("Tenis Coach : "+tenisCoach.getDailyFortune());
				
		//close the contex
		context.close();
	}

}
