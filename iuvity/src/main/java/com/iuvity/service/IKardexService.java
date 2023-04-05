package com.iuvity.service;

import java.util.List;

import com.iuvity.domain.Kardex;
import com.iuvity.payload.RequestCreacionStock;
import com.iuvity.payload.RequestDevolucionCompraProducto;
import com.iuvity.payload.RequestDevolucionVentaProducto;
import com.iuvity.payload.RequestIngresoProducto;
import com.iuvity.payload.RequestVentaProducto;

public interface IKardexService {
	
	/**
	 * Método que permite ingresar un producto nuevo a la bd
	 * @param rcs
	 * @return
	 */
	public String ingresarProductoNuevo(RequestCreacionStock rcs);
	
	/**
	 * Método que permite ingresar la factura de compra de un producto
	 * @param rip
	 * @return
	 */
	public String ingresarCompraProducto(RequestIngresoProducto rip);
	
	/**
	 * Método que permite ingresar una factura de venta de un producto
	 * @param rvp
	 * @return
	 */
	public String ingresarVentaProducto(RequestVentaProducto rvp);
	
	/**
	 * Método que permite realizar la devolución de una factura de compra
	 * @param rdcp
	 * @return
	 */
	public String devolucionCompraProducto(RequestDevolucionCompraProducto rdcp);
	
	/**
	 * Método que permite realizar la devolución de una factura de venta
	 * @param rdvp
	 * @return
	 */
	public String devolucionVentaProducto(RequestDevolucionVentaProducto rdvp);
	
	/**
	 * Método que permite consultar el kardex por mes y anio
	 * @param mes
	 * @param anio
	 * @param codigo_producto
	 * @return
	 */
	public List<Kardex> consultaKardexMesAnio(Integer mes, Integer anio, Integer codigo_producto);
}
