package com.jorgejy.beans;

public class Ciudad {

	private String nombre;

	private void init() {
		System.out.println("Antes de iniciar el bean ciudad");
	}
	
	private void destroy() {
		System.out.println("Antes de destruir al ciudad");
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
