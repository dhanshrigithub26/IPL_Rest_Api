package com.tka.Model;

public class Matches {
	
	private int matchId;
	private int teamOneName;
	private int teamTwoName;
	private String date;
	private String venue;
	private String result;
	
	
	
	public Matches() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getMatchId() {
		return matchId;
	}



	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}



	public int getTeamOneName() {
		return teamOneName;
	}



	public void setTeamOneName(int teamOneName) {
		this.teamOneName = teamOneName;
	}



	public int getTeamTwoName() {
		return teamTwoName;
	}



	public void setTeamTwoName(int teamTwoName) {
		this.teamTwoName = teamTwoName;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getVenue() {
		return venue;
	}



	public void setVenue(String venue) {
		this.venue = venue;
	}



	public String getResult() {
		return result;
	}



	public void setResult(String result) {
		this.result = result;
	}



	
	public Matches(int matchId, int teamOneName, int teamTwoName, String date, String venue, String result) {
		super();
		this.matchId = matchId;
		this.teamOneName = teamOneName;
		this.teamTwoName = teamTwoName;
		this.date = date;
		this.venue = venue;
		this.result = result;
	}



	@Override
	public String toString() {
		return "Matches [matchId=" + matchId + ", teamOneName=" + teamOneName + ", teamTwoName=" + teamTwoName
				+ ", date=" + date + ", venue=" + venue + ", result=" + result + "]";
	}
	
	
	
	
	
	
	

}
