package com.iuvity.payload;

import java.io.Serializable;

public class RequestVentaProducto implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private Integer codigo_producto;
	private String fecha;
	private String descripcion;
	private float salida_cant;
	private Integer codigo_cliente;
	private String tipo_tarjeta;
	private String numero_tarjeta;
	private String nombre_titular;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param salida_cant
	 * @param codigo_cliente
	 * @param tipo_tarjeta
	 * @param numero_tarjeta
	 * @param nombre_titular
	 */
	public RequestVentaProducto(Integer codigo_producto, String fecha, String descripcion, float salida_cant,
			Integer codigo_cliente, String tipo_tarjeta, String numero_tarjeta,
			String nombre_titular) {
		super();
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.salida_cant = salida_cant;
		this.codigo_cliente = codigo_cliente;
		this.tipo_tarjeta = tipo_tarjeta;
		this.numero_tarjeta = numero_tarjeta;
		this.nombre_titular = nombre_titular;
	}

	/**
	 * Constructor vacio
	 */
	public RequestVentaProducto() {
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

	public float getSalida_cant() {
		return salida_cant;
	}

	public void setSalida_cant(float salida_cant) {
		this.salida_cant = salida_cant;
	}

	public Integer getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Integer codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// METODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "RequestVentaProducto [codigo_producto=" + codigo_producto + ", fecha=" + fecha + ", descripcion="
				+ descripcion + ", salida_cant=" + salida_cant + ", codigo_cliente="
				+ codigo_cliente + ", tipo_tarjeta=" + tipo_tarjeta + ", numero_tarjeta=" + numero_tarjeta
				+ ", nombre_titular=" + nombre_titular + "]";
	}

}
