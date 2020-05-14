package com.jorgejy.beans;

public class Persona {

	private int id;
	private String nombre;
	private String apodo;
	private Pais pais;
	
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public Persona(int id, String nombre, String apodo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	
	public Persona(int id) {
		this.id  = id;
	}
	
	public Persona(String apodo) {
		this.apodo = apodo;
	}
	
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	
}
