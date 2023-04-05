package com.iuvity.payload;

import java.io.Serializable;

public class RequestCreacionStock implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private String nombre;
	private String referencia;
	private String unidad;
	private Integer codigo_proveedor;
	private String fecha_factura;
	private float valor_total;
	private Integer cantidad;
	private String descripcion;
	private Integer anio;
	private String categoria;
	private String tipo;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param nombre
	 * @param referencia
	 * @param unidad
	 * @param codigo_proveedor
	 * @param fecha_factura
	 * @param valor_total
	 * @param cantidad
	 * @param descripcion
	 * @param anio
	 * @param categoria
	 * @param tipo
	 * @param base
	 */
	public RequestCreacionStock(String nombre, String referencia, String unidad, Integer codigo_proveedor,
			String fecha_factura, float valor_total, Integer cantidad, String descripcion, Integer anio,
			String categoria, String tipo) {
		super();
		this.nombre = nombre;
		this.referencia = referencia;
		this.unidad = unidad;
		this.codigo_proveedor = codigo_proveedor;
		this.fecha_factura = fecha_factura;
		this.valor_total = valor_total;
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.anio = anio;
		this.categoria = categoria;
		this.tipo = tipo;
	}

	/**
	 * Constructor vacio
	 */
	public RequestCreacionStock() {
		super();
	}

	// GETTERS AND SETTERS
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

	public Integer getCodigo_proveedor() {
		return codigo_proveedor;
	}

	public void setCodigo_proveedor(Integer codigo_proveedor) {
		this.codigo_proveedor = codigo_proveedor;
	}

	public String getFecha_factura() {
		return fecha_factura;
	}

	public void setFecha_factura(String fecha_factura) {
		this.fecha_factura = fecha_factura;
	}

	public float getValor_total() {
		return valor_total;
	}

	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "RequestCreacionStock [nombre=" + nombre + ", referencia=" + referencia + ", unidad=" + unidad
				+ ", codigo_proveedor=" + codigo_proveedor + ", fecha_factura=" + fecha_factura + ", valor_total="
				+ valor_total + ", cantidad=" + cantidad + ", descripcion=" + descripcion + ", anio=" + anio
				+ ", categoria=" + categoria + ", tipo=" + tipo + "]";
	}

}
