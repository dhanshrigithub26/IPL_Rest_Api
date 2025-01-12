package com.tka.Model;

public class Teams {
	
	private int  teamId;
	private String name;
	private String city;
	private String coach;
	
	
	public Teams() {
		super();
		
	}


	public int getTeamId() {
		return teamId;
	}


	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCoach() {
		return coach;
	}


	public void setCoach(String coach) {
		this.coach = coach;
	}



	public Teams(int teamId, String name, String city, String coach) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.city = city;
		this.coach = coach;
	}


	@Override
	public String toString() {
		return "Teams [teamId=" + teamId + ", name=" + name + ", city=" + city + ", coach=" + coach + "]";
	}
	
	
	
	
	
	
	
	
	

}
