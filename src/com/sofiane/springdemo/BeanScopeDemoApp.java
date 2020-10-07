package com.sofiane.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
		
		//load the spring configuration file 
		ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		//retrieve the bean from spring container 
		Coach theCoach =context.getBean("myGolfCoach",Coach.class) ;
		Coach alphaCoach =context.getBean("myGolfCoach",Coach.class) ;
		
		//call methods
		
		//close context
		
		
		
	}
}
