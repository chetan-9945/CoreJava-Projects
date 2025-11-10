package com.player.array;

public abstract class Players implements Batsman, Bowler 
{
	String name;
	int teamId;
	int matches;
	String debutDate;
	Teams[] team; 
	
	public Players(String name, int teamId, int matches, String debutDate,Teams[] team)
	{
		super();
		this.name = name;
		this.teamId = teamId;
		this.matches = matches;
		this.debutDate = debutDate;
		this.team=team;
	}
	
	
	@Override
	public void playedMatched() 
	{
		System.out.println(name+" Has Played "+matches+" No of Matches...");
	}

	@Override
	public void debutDate() 
	{
		System.out.println(name+" Debut date is "+debutDate);
	}

	@Override
	public void wickets(int wicket) 
	{
		System.out.println("The "+name+" has taken "+wicket+" No of wicktes...");
	}

	@Override
	public void totalRuns(int runs) 
	{
		System.out.println("The "+name+" has Scored "+runs+" Total Runs...");
	}

	@Override
	public void average(int innings,int runs) 
	{
        System.out.println("The "+name+""+(runs/innings)+" Average has.");
	}
	
	
}
