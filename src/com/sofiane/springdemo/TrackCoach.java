package com.sofiane.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//literal values
	private String emailAddress;
	public void setEmailAddress(String emailAddress) {
		System.err.println("CricketCoach : inside setter methods : for setEmailAddress ///");
		this.emailAddress = emailAddress;
	}
	public void setTeam(String team) {
		System.err.println("CricketCoach : inside setter methods for setTeam ");
		this.team = team;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	private String team;
	
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
