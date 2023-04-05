package com.iuvity.payload;

import java.util.Set;

import javax.validation.constraints.*;

public class RequestRegistrar {
	
	// Atributos
	
	private Integer cedula;

	@NotBlank
	@Size(max = 50)
	private String nombre;

	@NotBlank
	@Size(max = 50)
	private String usuario;

	@NotBlank
	private String password;

	// Constructores
	/**
	 * Constructor con todos los atributos
	 * @param cedula
	 * @param nombre
	 * @param usuario
	 * @param password
	 */
	public RequestRegistrar(@NotBlank Integer cedula, @NotBlank @Size(max = 50) String nombre,
			@NotBlank @Size(max = 50) @Email String usuario, @NotBlank String password) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
	}

	// Getters y Setters
	public RequestRegistrar() {
		super();
	}

	public Integer getCedula() {
		return cedula;
	}

	public void setCedula(Integer cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
