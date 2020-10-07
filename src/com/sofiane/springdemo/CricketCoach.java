package com.sofiane.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	//literal values
	private String emailAddress;
	private String team;
		
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach : inside setter methods : for setEmailAddress ///");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter methods for setTeam ");

		this.team = team;
	}
	public String getEmailAddress() {
			return emailAddress;
	}
	public String getTeam() {
		return team;
	}
		
	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("inside No-arg constructor of CricketCoach class");
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
