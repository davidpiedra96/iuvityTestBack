package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADMIN")
public class Admin {
	@Id
	@Column(name = "cedula")
	Integer cedula;

	@Column(name = "nombre")
	String nombre;

	@Column(name = "usuario")
	String usuario;

	@Column(name = "password")
	String password;

	public synchronized Integer getCedula() {
		return cedula;
	}

	public synchronized void setCedula(Integer cedula) {
		this.cedula = cedula;
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

	public synchronized String getPassword() {
		return password;
	}

	public synchronized void setPassword(String password) {
		this.password = password;
	}

	public Admin(Integer cedula, String nombre, String usuario, String password) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [cedula=" + cedula + ", nombre=" + nombre + ", usuario=" + usuario + ", password=" + password
				+ "]";
	}

}
