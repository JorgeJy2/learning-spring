package com.jorgejy.beans;


public class Player {

	private String name;
	private int id;
	private Team team;
	private Shirt shirt;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public Shirt getShirt() {
		return shirt;
	}
	public void setShirt(Shirt shirt) {
		this.shirt = shirt;
	}
		
}
