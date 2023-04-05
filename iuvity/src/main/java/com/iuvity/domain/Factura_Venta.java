package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Factura_Venta")
public class Factura_Venta {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "codigo_cliente")
	private Integer codigo_cliente;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "tipo_tarjeta")
	private String tipo_tarjeta;

	@Column(name = "numero_tarjeta")
	private String numero_tarjeta;

	@Column(name = "nombre_titular")
	private String nombre_titular;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * @param codigo
	 * @param codigo_cliente
	 * @param fecha
	 * @param tipo_tarjeta
	 * @param numero_tarjeta
	 * @param nombre_titular
	 */
	public Factura_Venta(Integer codigo, Integer codigo_cliente, String fecha, String tipo_tarjeta,
			String numero_tarjeta, String nombre_titular) {
		super();
		this.codigo = codigo;
		this.codigo_cliente = codigo_cliente;
		this.fecha = fecha;
		this.tipo_tarjeta = tipo_tarjeta;
		this.numero_tarjeta = numero_tarjeta;
		this.nombre_titular = nombre_titular;
	}

	/**
	 * Constructor sin campo codigo
	 * @param codigo_cliente
	 * @param fecha
	 * @param tipo_tarjeta
	 * @param numero_tarjeta
	 * @param nombre_titular
	 */
	public Factura_Venta(Integer codigo_cliente, String fecha, String tipo_tarjeta, String numero_tarjeta,
			String nombre_titular) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.fecha = fecha;
		this.tipo_tarjeta = tipo_tarjeta;
		this.numero_tarjeta = numero_tarjeta;
		this.nombre_titular = nombre_titular;
	}
	
	/**
	 * Constructor vacio 
	 */
	public Factura_Venta() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getTipo_tarjeta() {
		return tipo_tarjeta;
	}

	public void setTipo_tarjeta(String tipo_tarjeta) {
		this.tipo_tarjeta = tipo_tarjeta;
	}

	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public String getNombre_titular() {
		return nombre_titular;
	}

	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}

	// MÉTODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Factura_Venta [codigo=" + codigo + ", codigo_cliente=" + codigo_cliente + ", fecha=" + fecha
				+ ", tipo_tarjeta=" + tipo_tarjeta + ", numero_tarjeta=" + numero_tarjeta + ", nombre_titular="
				+ nombre_titular + "]";
	}

}
