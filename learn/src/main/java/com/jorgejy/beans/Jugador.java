package com.jorgejy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.jorgejy.interfaces.Equipo;

public class Jugador {
	private int numero;
	private String nombre;
	@Autowired
	@Qualifier("barcelonaQualifier")
	private Equipo equipo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Equipo getEquipo() {
		return equipo;
	}
	// No need if use @@Autowired
	// @Required
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
}
