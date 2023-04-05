package com.iuvity.payload;

import java.io.Serializable;

public class RequestIngresoProducto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private Integer codigo_producto;
	private String fecha;
	private String descripcion;
	private float entrada_cant;
	private float entrada_valor;
	private Integer codigo_proveedor;
	
	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param entrada_cant
	 * @param entrada_valor
	 * @param codigo_proveedor
	 */
	public RequestIngresoProducto(Integer codigo_producto, String fecha, String descripcion, float entrada_cant,
			float entrada_valor, Integer codigo_proveedor) {
		super();
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.entrada_cant = entrada_cant;
		this.entrada_valor = entrada_valor;
		this.codigo_proveedor = codigo_proveedor;
	}
	
	/**
	 * Constructor vacio
	 */
	public RequestIngresoProducto() {
		super();
	}


	// GETTERS AND SETTERS
	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getEntrada_cant() {
		return entrada_cant;
	}

	public void setEntrada_cant(float entrada_cant) {
		this.entrada_cant = entrada_cant;
	}

	public float getEntrada_valor() {
		return entrada_valor;
	}

	public void setEntrada_valor(float entrada_valor) {
		this.entrada_valor = entrada_valor;
	}

	public Integer getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(Integer codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// METODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "RequestIngresoProducto [codigo_producto=" + codigo_producto + ", fecha=" + fecha + ", descripcion="
				+ descripcion + ", entrada_cant=" + entrada_cant + ", entrada_valor=" + entrada_valor
				+ ", codigo_proveedor=" + codigo_proveedor + "]";
	}
	
	
	

}
