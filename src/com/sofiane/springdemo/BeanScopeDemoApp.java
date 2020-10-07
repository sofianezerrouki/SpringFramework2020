package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		
		//Singleton scope :tow object reference to the same area of memory     
		
		//prototype scope : new object for each request
		
		
		//load the spring configuration file 
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve the bean from spring container 
		Coach theCoach =context.getBean("myGolfCoach",Coach.class) ;
		Coach alphaCoach =context.getBean("myGolfCoach",Coach.class) ;
		
		//check if they are the same beans 
		boolean result = (theCoach == alphaCoach);
		System.out.println("pointing in the same object "+result);
		System.out.println("Memory location for the Coach "+theCoach);
		System.out.println("Memory location for the alphaCoach "+alphaCoach);
		
		
		//close context
		context.close();
		
	}
}
