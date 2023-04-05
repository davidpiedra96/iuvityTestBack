package com.iuvity.domain;

public class Rol {
	
	// Atributos
	private Integer id;
	private ERol nombre;
	
	// Constructores
	/**
	 * Constructor con todos los campos
	 * @param id
	 * @param nombre
	 */
	public Rol(Integer id, ERol nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * Constructor vacio
	 */
	public Rol() {
		super();
	}
	
	// Getters y Setters
	public synchronized Integer getId() {
		return id;
	}
	public synchronized void setId(Integer id) {
		this.id = id;
	}
	public synchronized ERol getNombre() {
		return nombre;
	}
	public synchronized void setNombre(ERol nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Rol [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
