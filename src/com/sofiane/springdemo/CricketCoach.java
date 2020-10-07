package com.sofiane.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("inside No-arg constructor");
	}
	//our seter methods
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter methods !");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice Faste Boling for 20 min ";
	}

	@Override
	public String getDailyFortune() {

		return fortuneService.getFortuneService();
	}

}
