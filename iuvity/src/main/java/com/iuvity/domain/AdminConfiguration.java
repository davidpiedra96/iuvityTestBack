package com.iuvity.domain;

import java.util.HashSet;
import java.util.Set;

public class AdminConfiguration extends Admin{

	private Set<Rol> roles = new HashSet<>();

	// Constructor
	/**
	 * Constructor con todos los campos
	 * @param cedula
	 * @param nombre
	 * @param usuario
	 * @param password
	 * @param roles
	 */
	public AdminConfiguration(Integer cedula, String nombre, String usuario, String password, Set<Rol> roles) {
		super(cedula, nombre, usuario, password);
		this.roles = roles;
	}
	

	public AdminConfiguration() {
	}








	// Getters y Setters
	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}
	
	
}
