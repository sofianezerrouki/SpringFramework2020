package com.sofiane.springdemo;

public class NextFortuneService implements FortuneService {
	
	
	public FortuneService[] fortuneService;
	
	public NextFortuneService(FortuneService[] fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	public NextFortuneService() {
		super();
	}

	@Override
	public String getFortuneService() {
		int i =Math.round(3);
		return fortuneService[i].getFortuneService();
	}

}
