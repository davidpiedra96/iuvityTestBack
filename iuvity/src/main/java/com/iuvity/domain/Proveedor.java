package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;
	
	@Column(name = "nit")
	private String nit;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "representante_legal")
	private String representante_legal;

	// CONSTRUCTORES
	
	/**
	 * Constructor con todos los campos
	 * @param codigo
	 * @param nit
	 * @param direccion
	 * @param representante_legal
	 */
	public Proveedor(Integer codigo, String nit, String direccion, String representante_legal) {
		super();
		this.codigo = codigo;
		this.nit = nit;
		this.direccion = direccion;
		this.representante_legal = representante_legal;
	}

	/**
	 * Constructor con todos los campos excepto el código
	 * @param nit
	 * @param direccion
	 * @param representante_legal
	 */
	public Proveedor(String nit, String direccion, String representante_legal) {
		super();
		this.nit = nit;
		this.direccion = direccion;
		this.representante_legal = representante_legal;
	}

	/**
	 * Constructor vacio
	 */
	public Proveedor() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRepresentante_legal() {
		return representante_legal;
	}

	public void setRepresentante_legal(String representante_legal) {
		this.representante_legal = representante_legal;
	}

	//MÉTODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Proveedor [codigo=" + codigo + ", nit=" + nit + ", direccion=" + direccion + ", representante_legal="
				+ representante_legal + "]";
	}
	
	
	
}
