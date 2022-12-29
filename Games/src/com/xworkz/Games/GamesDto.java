package com.xworkz.Games;

public class GamesDto {

	private String gameName;
	private int noOfPlayer;
	private String GameTime;
	private boolean isIndoore;
	private String gtratestOfAllTimePlayer;
	
	
	public GamesDto(String gameName, int noOfPlayer, String GameTime, boolean isIndoore,
			String gtratestOfAllTimePlayer) {
		super();
		this.gameName = gameName;
		this.noOfPlayer = noOfPlayer;
		this.GameTime = GameTime;
		this.isIndoore = isIndoore;
		this.gtratestOfAllTimePlayer = gtratestOfAllTimePlayer;
	}


	public GamesDto() {
		
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public int getNoOfPlayer() {
		return noOfPlayer;
	}


	public void setNoOfPlayer(int noOfPlayer) {
		this.noOfPlayer = noOfPlayer;
	}


	public String getGameTime() {
		return GameTime;
	}


	public void setGameTime(String GameTime) {
		this.GameTime = GameTime;
	}


	public boolean isIndoore() {
		return isIndoore;
	}


	public void setIndoore(boolean isIndoore) {
		this.isIndoore = isIndoore;
	}


	public String getGtratestOfAllTimePlayer() {
		return gtratestOfAllTimePlayer;
	}


	public void setGtratestOfAllTimePlayer(String gtratestOfAllTimePlayer) {
		this.gtratestOfAllTimePlayer = gtratestOfAllTimePlayer;
	}


	@Override
	public String toString() {
		return "GamesDto [gameName=" + gameName + ", noOfPlayer=" + noOfPlayer + ", GameTime=" + GameTime
				+ ", isIndoore=" + isIndoore + ", gtratestOfAllTimePlayer=" + gtratestOfAllTimePlayer + "]";
	}
	
	
}
	