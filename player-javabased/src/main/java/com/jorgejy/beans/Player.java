package com.jorgejy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.jorgejy.interfaces.Team;

@Component
public class Player {

	@Value("Jorge")
	private String name;
	@Value("0")
	private int id;
	@Autowired
	@Qualifier("barcelona")
	private Team team;
	@Autowired 
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
