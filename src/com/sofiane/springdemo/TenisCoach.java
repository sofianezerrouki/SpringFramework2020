
package com.sofiane.springdemo;

public class TenisCoach implements Coach{
	
	private FortuneService fortuneServise;
	
	public TenisCoach(FortuneService fortuneServise) {
		super();
		this.fortuneServise = fortuneServise;
	}

	public TenisCoach() {
		super();
	}

	@Override
	public String getDailyWorkout() {
		
		return "Tenis Coach ...";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneServise.getFortuneService();
	}

}
