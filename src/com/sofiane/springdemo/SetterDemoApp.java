package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the Spring XMLFilepath
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve Bean from Spring container --dependency setter injection in the XML configuration --
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		//call methods on the bean
		//....
		System.out.println(theCoach.getDailyWorkout());
		
		//dependency Constructor injection 
		System.out.println(theCoach.getDailyFortune());
		
		
		//call our methods to get the literal values 
		System.out.println(" Email address : "+theCoach.getEmailAddress());
		System.out.println(" Team Name : "+theCoach.getTeam());
		//close the context
		
		context.close();

	}

}
