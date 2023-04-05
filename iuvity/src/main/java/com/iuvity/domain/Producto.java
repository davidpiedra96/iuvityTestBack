package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "referencia")
	private String referencia;

	@Column(name = "unidad")
	private String unidad;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo
	 * @param nombre
	 * @param referencia
	 * @param unidad
	 * @param anio
	 * @param categoria
	 * @param tipo
	 */
	public Producto(Integer codigo, String nombre, String referencia, String unidad) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.referencia = referencia;
		this.unidad = unidad;
	}

	/**
	 * Constructor sin campo codigo
	 * 
	 * @param nombre
	 * @param referencia
	 * @param unidad
	 */
	public Producto(String nombre, String referencia, String unidad) {
		super();
		this.nombre = nombre;
		this.referencia = referencia;
		this.unidad = unidad;
	}

	/**
	 * Constructor vacio
	 */
	public Producto() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	

	// MÉTODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", referencia=" + referencia + ", unidad=" + unidad + "]";
	}

}
