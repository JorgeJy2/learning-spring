package com.jorgejy.beans;

import org.springframework.stereotype.Component;
import interfaces.Team;

@Component
public class Barcelona implements Team{

	private String name;
	private int id;
	
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
	@Override
	public String mostrar() {
		return "I'm barcelona.";
	}
	
}
