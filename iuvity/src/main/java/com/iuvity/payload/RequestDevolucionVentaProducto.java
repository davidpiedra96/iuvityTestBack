package com.iuvity.payload;

import java.io.Serializable;

public class RequestDevolucionVentaProducto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private Integer codigo_producto;
	private String fecha;
	private String descripcion;
	private Float salida_cant;
	private Integer codigo_factura_venta;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param salida_cant
	 * @param salida_valor
	 * @param codigo_factura_venta
	 */
	public RequestDevolucionVentaProducto(Integer codigo_producto, String fecha, String descripcion, Float salida_cant,
			Integer codigo_factura_venta) {
		super();
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.salida_cant = salida_cant;

		this.codigo_factura_venta = codigo_factura_venta;
	}

	/**
	 * Constructor vacio
	 */
	public RequestDevolucionVentaProducto() {
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

	public Float getSalida_cant() {
		return salida_cant;
	}

	public void setSalida_cant(Float salida_cant) {
		this.salida_cant = salida_cant;
	}

	public Integer getCodigo_factura_venta() {
		return codigo_factura_venta;
	}

	public void setCodigo_factura_venta(Integer codigo_factura_venta) {
		this.codigo_factura_venta = codigo_factura_venta;
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
		return "RequestDevolucionVentaProducto [codigo_producto=" + codigo_producto + ", fecha=" + fecha
				+ ", descripcion=" + descripcion + ", salida_cant=" + salida_cant + ",codigo_factura_venta="
				+ codigo_factura_venta + "]";
	}

}
