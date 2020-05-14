package com.jorgejy.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {

	// @Value default value using annotation
	@Value("Hola mundo desde anotación!")
	private String saludo;
	
	public Mundo() {
		System.out.println("Hi! Mundo instance.");
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	
}
