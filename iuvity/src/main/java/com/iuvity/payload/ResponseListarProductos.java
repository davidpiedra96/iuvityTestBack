package com.iuvity.payload;

import java.io.Serializable;

import javax.persistence.Entity;

import com.iuvity.domain.Producto;

@Entity
public class ResponseListarProductos extends Producto {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// Atributos
	private Float vlr_unitario;
	private Float saldo_cant;

	// Constructores
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo
	 * @param nombre
	 * @param referencia
	 * @param unidad
	 * @param vlr_unitario
	 * @param saldo_cant
	 */
	public ResponseListarProductos(Integer codigo, String nombre, String referencia, String unidad, Float vlr_unitario,
			Float saldo_cant) {
		super(codigo, nombre, referencia, unidad);
		this.vlr_unitario = vlr_unitario;
		this.saldo_cant = saldo_cant;
	}

	/**
	 * Constructor vacio
	 */
	public ResponseListarProductos() {
	}

	// Getters y Setters
	public Float getVlr_unitario() {
		return vlr_unitario;
	}

	public void setVlr_unitario(Float vlr_unitario) {
		this.vlr_unitario = vlr_unitario;
	}

	public Float getSaldo_cant() {
		return saldo_cant;
	}

	public void setSaldo_cant(Float saldo_cant) {
		this.saldo_cant = saldo_cant;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "RequestListarProductos [vlr_unitario=" + vlr_unitario + ", saldo_cant=" + saldo_cant + "]";
	}

}