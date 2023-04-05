package com.iuvity.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Kardex")
public class Kardex {

	// ATRIBUTOS
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "indice")
	private Integer indice;
	
	@Column(name = "codigo_producto")
	private Integer codigo_producto;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "vlr_unitario")
	private Float vlr_unitario;
	
	@Column(name = "entrada_cant")
	private Float entrada_cant;
	
	@Column(name = "entrada_valor")
	private Float entrada_valor;
	
	@Column(name = "salida_cant")
	private Float salida_cant;
	
	@Column(name = "salida_valor")
	private Float salida_valor;
	
	@Column(name = "saldo_cant")
	private Float saldo_cant;
	
	@Column(name = "saldo_valor")
	private Float saldo_valor;
	
	@Column(name = "codigo_factura_venta")
	private Integer codigo_factura_venta;
	
	@Column(name = "codigo_factura_compra")
	private Integer codigo_factura_compra;

	// Constructores
	/**
	 * Constructor con todos los campos
	 * @param indice
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param vlr_unitario
	 * @param entrada_cant
	 * @param entrada_valor
	 * @param salida_cant
	 * @param salida_valor
	 * @param saldo_cant
	 * @param saldo_valor
	 * @param codigo_factura_venta
	 * @param codigo_factura_compra
	 */
	public Kardex(Integer indice, Integer codigo_producto, String fecha, String descripcion, Float vlr_unitario,
			Float entrada_cant, Float entrada_valor, Float salida_cant, Float salida_valor, Float saldo_cant,
			Float saldo_valor, Integer codigo_factura_venta, Integer codigo_factura_compra) {
		super();
		this.indice = indice;
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.vlr_unitario = vlr_unitario;
		this.entrada_cant = entrada_cant;
		this.entrada_valor = entrada_valor;
		this.salida_cant = salida_cant;
		this.salida_valor = salida_valor;
		this.saldo_cant = saldo_cant;
		this.saldo_valor = saldo_valor;
		this.codigo_factura_venta = codigo_factura_venta;
		this.codigo_factura_compra = codigo_factura_compra;
	}

	/**
	 * Constructor sin campo indice
	 * @param codigo_producto
	 * @param fecha
	 * @param descripcion
	 * @param vlr_unitario
	 * @param entrada_cant
	 * @param entrada_valor
	 * @param salida_cant
	 * @param salida_valor
	 * @param saldo_cant
	 * @param saldo_valor
	 * @param codigo_factura_venta
	 * @param codigo_factura_compra
	 */
	public Kardex(Integer codigo_producto, String fecha, String descripcion, Float vlr_unitario, Float entrada_cant,
			Float entrada_valor, Float salida_cant, Float salida_valor, Float saldo_cant, Float saldo_valor,
			Integer codigo_factura_venta, Integer codigo_factura_compra) {
		super();
		this.codigo_producto = codigo_producto;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.vlr_unitario = vlr_unitario;
		this.entrada_cant = entrada_cant;
		this.entrada_valor = entrada_valor;
		this.salida_cant = salida_cant;
		this.salida_valor = salida_valor;
		this.saldo_cant = saldo_cant;
		this.saldo_valor = saldo_valor;
		this.codigo_factura_venta = codigo_factura_venta;
		this.codigo_factura_compra = codigo_factura_compra;
	}
	
	/**
	 * Constructor vacio
	 */
	public Kardex() {
		super();
	}

	// GETTERS AND SETTERS
	public Integer getIndice() {
		return indice;
	}

	public void setIndice(Integer indice) {
		this.indice = indice;
	}

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

	public Float getVlr_unitario() {
		return vlr_unitario;
	}

	public void setVlr_unitario(Float vlr_unitario) {
		this.vlr_unitario = vlr_unitario;
	}

	public Float getEntrada_cant() {
		return entrada_cant;
	}

	public void setEntrada_cant(Float entrada_cant) {
		this.entrada_cant = entrada_cant;
	}

	public Float getEntrada_valor() {
		return entrada_valor;
	}

	public void setEntrada_valor(Float entrada_valor) {
		this.entrada_valor = entrada_valor;
	}

	public Float getSalida_cant() {
		return salida_cant;
	}

	public void setSalida_cant(Float salida_cant) {
		this.salida_cant = salida_cant;
	}

	public Float getSalida_valor() {
		return salida_valor;
	}

	public void setSalida_valor(Float salida_valor) {
		this.salida_valor = salida_valor;
	}

	public Float getSaldo_cant() {
		return saldo_cant;
	}

	public void setSaldo_cant(Float saldo_cant) {
		this.saldo_cant = saldo_cant;
	}

	public Float getSaldo_valor() {
		return saldo_valor;
	}

	public void setSaldo_valor(Float saldo_valor) {
		this.saldo_valor = saldo_valor;
	}

	public Integer getCodigo_factura_venta() {
		return codigo_factura_venta;
	}

	public void setCodigo_factura_venta(Integer codigo_factura_venta) {
		this.codigo_factura_venta = codigo_factura_venta;
	}

	public Integer getCodigo_factura_compra() {
		return codigo_factura_compra;
	}

	public void setCodigo_factura_compra(Integer codigo_factura_compra) {
		this.codigo_factura_compra = codigo_factura_compra;
	}

	// Métodos
	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return "Kardex [indice=" + indice + ", codigo_producto=" + codigo_producto + ", fecha=" + fecha
				+ ", descripcion=" + descripcion + ", vlr_unitario=" + vlr_unitario + ", entrada_cant=" + entrada_cant
				+ ", entrada_valor=" + entrada_valor + ", salida_cant=" + salida_cant + ", salida_valor=" + salida_valor
				+ ", saldo_cant=" + saldo_cant + ", saldo_valor=" + saldo_valor + ", codigo_factura_venta="
				+ codigo_factura_venta + ", codigo_factura_compra=" + codigo_factura_compra + "]";
	}
	
	
	
}
