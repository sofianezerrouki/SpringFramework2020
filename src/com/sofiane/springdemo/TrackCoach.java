package com.sofiane.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	public TrackCoach() {
		super();
	}
	@Override
	public String getDailyWorkout() {
		
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortuneService();
	}

}
