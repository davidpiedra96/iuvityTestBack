package com.iuvity.payload;

import java.io.Serializable;

public class RequestDevolucionCompraProducto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private Integer codigo_producto;
	private String fecha;
	private String descripcion;
	private float entrada_cant;
	private float valor_compra;
	private Integer codigo_factura_compra;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param entrada_cant
	 * @param valor_venta
	 * @param codigo_factura_compra
	 */
	public RequestDevolucionCompraProducto(Integer codigo_producto, String fecha, String descripcion,
			float entrada_cant, float valor_compra, Integer codigo_factura_compra) {
		super();
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.entrada_cant = entrada_cant;
		this.valor_compra = valor_compra;
		this.codigo_factura_compra = codigo_factura_compra;
	}

	/**
	 * Constructor vacio
	 */
	public RequestDevolucionCompraProducto() {
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

	public float getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(float valor_compra) {
		this.valor_compra = valor_compra;
	}

	public Integer getCodigo_factura_compra() {
		return codigo_factura_compra;
	}

	public void setCodigo_factura_compra(Integer codigo_factura_compra) {
		this.codigo_factura_compra = codigo_factura_compra;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// MÉTODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "RequestDevolucionCompraProducto [codigo_producto=" + codigo_producto + ", fecha=" + fecha
				+ ", descripcion=" + descripcion + ", entrada_cant=" + entrada_cant + ", valor_compra=" + valor_compra
				+ ", codigo_factura_compra=" + codigo_factura_compra + "]";
	}
}
