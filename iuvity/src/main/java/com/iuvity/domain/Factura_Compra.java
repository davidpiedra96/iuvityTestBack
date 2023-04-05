package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Factura_Compra")
public class Factura_Compra {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "codigo_proveedor")
	private Integer codigo_proveedor;

	@Column(name = "fecha")
	private String fecha;

	// Constructores
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo
	 * @param codigo_proveedor
	 * @param fecha
	 */
	public Factura_Compra(Integer codigo, Integer codigo_proveedor, String fecha) {
		super();
		this.codigo = codigo;
		this.codigo_proveedor = codigo_proveedor;
		this.fecha = fecha;
	}

	/**
	 * Constructor con todos los campos excepto el campo codigo
	 * 
	 * @param codigo_proveedor
	 * @param fecha
	 */
	public Factura_Compra(Integer codigo_proveedor, String fecha) {
		super();
		this.codigo_proveedor = codigo_proveedor;
		this.fecha = fecha;
	}

	/**
	 * Constructor vacio
	 */
	public Factura_Compra() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(Integer codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Factura_Compra [codigo=" + codigo + ", codigo_proveedor=" + codigo_proveedor + ", fecha=" + fecha + "]";
	}

}
