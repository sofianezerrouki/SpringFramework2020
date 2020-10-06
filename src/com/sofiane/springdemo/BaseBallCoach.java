package com.sofiane.springdemo;

public class BaseBallCoach implements Coach{
	
	//define a field for dependency 
	private FortuneService fortuneService;
	
	//define a constructor for dependency 
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	
	public String getDailyWorkout() {
		return "Spend 30 minute on batting practice ... ";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}
	
	
}
