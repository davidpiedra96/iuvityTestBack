package com.iuvity.payload;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	
	private String nombre;
	private String usuario;
	private List<String> roles;

	public JwtResponse(String accessToken, String nombre, String usuario, List<String> roles) {
		this.token = accessToken;
		this.nombre = nombre;
		this.usuario = usuario;
		this.roles = roles;
	}

	public synchronized String getToken() {
		return token;
	}

	public synchronized void setToken(String token) {
		this.token = token;
	}

	public synchronized String getType() {
		return type;
	}

	public synchronized void setType(String type) {
		this.type = type;
	}

	public synchronized String getNombre() {
		return nombre;
	}

	public synchronized void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public synchronized String getUsuario() {
		return usuario;
	}

	public synchronized void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public synchronized List<String> getRoles() {
		return roles;
	}

	public synchronized void setRoles(List<String> roles) {
		this.roles = roles;
	}

}
