package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Producto_Factura_Venta")
public class Producto_Factura_Venta {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;
	
	@Column(name = "codigo_producto")
	private Integer codigo_producto;

	@Column(name = "codigo_factura")
	private Integer codigo_factura;

	@Column(name = "valor_total")
	private float valor_total;

	@Column(name = "cantidad")
	private float cantidad;

	// CONSTRUCTORES
	/**
	 * Constructor con todos los campos
	 * 
	 * @param codigo_producto
	 * @param codigo_factura
	 * @param valor_total
	 * @param cantidad
	 */
	public Producto_Factura_Venta(Integer codigo_producto, Integer codigo_factura, float valor_total, float cantidad) {
		super();
		this.codigo_producto = codigo_producto;
		this.codigo_factura = codigo_factura;
		this.valor_total = valor_total;
		this.cantidad = cantidad;
	}
	
	/**
	 * Constructor con todos los campos
	 * @param codigo
	 * @param codigo_producto
	 * @param codigo_factura
	 * @param valor_total
	 * @param cantidad
	 */
	public Producto_Factura_Venta(Integer codigo, Integer codigo_producto, Integer codigo_factura, float valor_total,
			float cantidad) {
		super();
		this.codigo = codigo;
		this.codigo_producto = codigo_producto;
		this.codigo_factura = codigo_factura;
		this.valor_total = valor_total;
		this.cantidad = cantidad;
	}

	/**
	 * Constructor vacio
	 */
	public Producto_Factura_Venta() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Integer getCodigo_factura() {
		return codigo_factura;
	}

	public void setCodigo_factura(Integer codigo_factura) {
		this.codigo_factura = codigo_factura;
	}

	public float getValor_total() {
		return valor_total;
	}

	public void setValor_total(float valor_total) {
		this.valor_total = valor_total;
	}

	public float getCantidad() {
		return cantidad;
	}

	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}

	// METODOS
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Producto_Factura_Venta [codigo_producto=" + codigo_producto + ", codigo_factura=" + codigo_factura
				+ ", valor_total=" + valor_total + ", cantidad=" + cantidad + "]";
	}
}
