package com.iuvity.service;

import java.util.List;

import com.iuvity.domain.Producto;
import com.iuvity.payload.ResponseListarProductos;

public interface IProductoService {
	/**
	 * Método que obtiene la lista de productos
	 * @return
	 */
	public List<ResponseListarProductos> listarProductos();
	
	/**
	 * Método que busca un producto
	 * @param codigo_producto
	 * @return
	 */
	public ResponseListarProductos buscarProducto(Integer codigo_producto);
}
